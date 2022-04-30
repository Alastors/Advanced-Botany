package ab.common.core.handler;

import java.io.File;

import ab.AdvancedBotany;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigABHandler {

	public static Configuration config;
	public static boolean useManaChargerAnimation = true;
	public static int[] maxContainerMana = new int[] { 64000000, 8000000, 64000000 };
	public static double protectionFactorNebula = 1.0f;
	public static double damageFactorSpaceSword = 1.0f;
	public static int nebulaWandCooldownTick = 18;
	public static boolean hasManaCharger = true;
	public static int spreaderMaxMana = 128000;
	public static int spreaderBurstMana = 32000;
	public static String[] lockEntityListToHorn = new String[] {};
	public static String[] lockWorldNameNebulaRod = new String[] {};
	public static int limitXZCoords = 30000000;
	public static boolean hasAutoThaum = true;
	public static int maxDictariusCount = 64;
	public static int sprawlRodMaxArea = 64;
	
	public static void loadConfig(File configFile) {
		config = new Configuration(configFile);
		config.load();
		load();
		FMLCommonHandler.instance().bus().register(new ChangeListener());
	}
	
	public static void load() {
		String desc = "Maximum mana capacity for Mana Container";
		maxContainerMana[0] = loadPropInt("Mana Container Capacity", desc, maxContainerMana[0]);
		desc = "Maximum mana capacity for Diluted Mana Container";
		maxContainerMana[1] = loadPropInt("Mana Container Capacity (Diluted)", desc, maxContainerMana[1]);
		desc = "Maximum mana capacity for Fabulous Mana Container";
		maxContainerMana[2] = loadPropInt("Mana Container Capacity (Fabulous)", desc, maxContainerMana[2]);
		desc = "Activating the charging animation for the Mana Charger";
		useManaChargerAnimation = loadPropBool("Mana Charger lighting", desc, useManaChargerAnimation);
		desc = "Protection factor for nebula armour";
		protectionFactorNebula = loadPropDouble("Nebula Armor Protection Factor", desc, protectionFactorNebula);
		desc = "Damage factor for Space Blade";
		damageFactorSpaceSword = loadPropDouble("Space Sword Damage Factor", desc, damageFactorSpaceSword);
		desc = "The number of ticks needed to restore 1 unit of the Rod of Nebula strength.";
		nebulaWandCooldownTick = loadPropInt("Rod of Nebula Cooldown", desc, nebulaWandCooldownTick);
		desc = "Switching the Mana Charger on or off in the game";
		hasManaCharger = loadPropBool("Enable Mana Charger", desc, hasManaCharger);	
		desc = "Maximum amount of mana held in a mana spreader";
		spreaderMaxMana = loadPropInt("Spreader Max Mana", desc, spreaderMaxMana);
		desc = "Amount of Mana in a Mana Burst";
		spreaderBurstMana = loadPropInt("Spreader Burst Mana", desc, spreaderBurstMana);
		desc = "To block a creature, type it's class name";
		lockEntityListToHorn = loadPropString("Blocked creatures for double drop", desc, lockEntityListToHorn);
		desc = "Enter the name of the World you want to add to the blacklist";
		lockWorldNameNebulaRod = loadPropString("Locking Worlds for Teleportation with Nebula Rod", desc, lockWorldNameNebulaRod);
		desc = "Limitation on X Z coordinates for teleportation, do not increase the default value";
		limitXZCoords = loadPropInt("Restriction on X Z coordinates for Rod of Nebula", desc, limitXZCoords);
		desc = "Switching the Thaumim Crafty Crate on or off in the game";
		hasAutoThaum = loadPropBool("Enable Thaumim Crafty Crate", desc, hasAutoThaum);
		desc = "Limit the number of flowers next to each other";
		maxDictariusCount = loadPropInt("Max Dictarius Count", desc, maxDictariusCount);
		desc = "Changes the area of effect of a projectile created with Rod of Sprawl";
		sprawlRodMaxArea = loadPropInt("Rod of Sprawl Max Area", desc, sprawlRodMaxArea);
		if(config.hasChanged())
			config.save(); 
	}
	
	public static void loadPostInit() {
		if(config.hasChanged())
			config.save(); 
	}
	
	public static String[] loadPropString(String propName, String desc, String[] default_) {
		Property prop = config.get("general", propName, default_);
		prop.comment = desc;
		return prop.getStringList();
	}
	
	public static boolean loadPropBool(String propName, String desc, boolean default_) {
		Property prop = config.get("general", propName, default_);
		prop.comment = desc;
		return prop.getBoolean(default_);
	}
	
	public static int loadPropInt(String propName, String desc, int default_) {
		Property prop = config.get("general", propName, default_);
		prop.comment = desc;
		return prop.getInt(default_);
	}
	
	public static double loadPropDouble(String propName, String desc, double default_) {
		Property prop = config.get("general", propName, default_);
		prop.comment = desc;
		return prop.getDouble(default_);
	}
	
	public static class ChangeListener {
		@SubscribeEvent
		public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
			if(eventArgs.modID.equals(AdvancedBotany.modid))
				ConfigABHandler.load(); 
		}
	}
}