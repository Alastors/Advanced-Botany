package pulxes.ab.client.core.handler;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PlayerItemUsingSound {

	public EntityPlayer player;
	public ISound sound;
	public int maxTick = 0;
	public int tick = 0;
	public boolean isDeadingSound = false;
	public boolean hasCheckUse;
	
	public PlayerItemUsingSound(EntityPlayer player, ISound sound, int maxTick, boolean hasCheckUse) {
		this.player = player;
		this.sound = sound;
		this.maxTick = maxTick;
		this.hasCheckUse = hasCheckUse;
	}
	
	@SideOnly(Side.CLIENT)
	public static class ClientSoundHandler {
		
		public static Minecraft mc = Minecraft.getMinecraft();
		public static List<PlayerItemUsingSound> soundsList = new ArrayList<PlayerItemUsingSound>();
		
		public static void playSound(EntityPlayer player, SoundEvent soundIn, SoundCategory category, float volume, float pitch, int maxTick, boolean hasCheckUse) {
			if(!soundsList.isEmpty())
				for(int i = 0; i < soundsList.size(); i++) {
					PlayerItemUsingSound playerSound = soundsList.get(i);
					if(playerSound.player.isEntityEqual(player)) {
						if(playerSound.maxTick != 0 && playerSound.maxTick <= playerSound.tick && !playerSound.isDeadingSound) {
							playerSound.isDeadingSound = true;
							setSound(player, soundIn, category, volume, pitch, maxTick, hasCheckUse);
							return;
						}
						return;
					} else 
						setSound(player, soundIn, category, volume, pitch, maxTick, hasCheckUse);
				}
			else
				setSound(player, soundIn, category, volume, pitch, maxTick, hasCheckUse);
		}
		
		public static void playSound(EntityPlayer player, SoundEvent soundIn, SoundCategory category, float volume, float pitch, int maxTick) {
			playSound(player, soundIn, category, volume, pitch, maxTick, true);
		}
		
		public static void playSound(EntityPlayer player, SoundEvent soundIn, SoundCategory category, float volume, float pitch) {
			playSound(player, soundIn, category, volume, pitch, 0);
		}
		
		protected static void setSound(EntityPlayer player, SoundEvent soundIn, SoundCategory category, float volume, float pitch, int maxTick, boolean hasCheckUse) {
			PositionedSoundRecord posSound = new PositionedSoundRecord(soundIn, category, volume, pitch, (float)player.posX, (float)player.posY, (float)player.posZ);
			soundsList.add(new PlayerItemUsingSound(player, posSound, maxTick, hasCheckUse));
			mc.getSoundHandler().playSound(posSound);
		}
		
		public static void tick() {
			if(!soundsList.isEmpty()) {
				for(int i = 0; i < soundsList.size(); i++) {
					PlayerItemUsingSound playerSound = soundsList.get(i);
					playerSound.tick++;
					if(!mc.getSoundHandler().isSoundPlaying(playerSound.sound)) {
						soundsList.remove(playerSound);
						continue;
					} else if(playerSound.hasCheckUse && !isUseItem(playerSound.player)) {
						if(mc.getSoundHandler().isSoundPlaying(playerSound.sound))
							mc.getSoundHandler().stopSound(playerSound.sound);
						soundsList.remove(playerSound);
						continue;
					}	
				}
			}
		}	
		
		public static boolean isUseItem(EntityPlayer player) {
			return player.isHandActive() && !player.getActiveItemStack().isEmpty();
		}
	}
}