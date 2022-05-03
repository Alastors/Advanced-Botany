package ab.api;

import java.util.ArrayList;
import java.util.List;

import ab.api.recipe.RecipeAdvancedPlate;
import ab.api.recipe.RecipeAncientAlphirine;
import ab.common.core.handler.ConfigABHandler;
import ab.common.lib.register.ItemListAB;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;
import vazkii.botania.common.item.ModItems;

public class AdvancedBotanyAPI {

	public static List<RecipeAdvancedPlate> advancedPlateRecipes = new ArrayList<RecipeAdvancedPlate>();
	public static List<RecipeAncientAlphirine> alphirineRecipes = new ArrayList<RecipeAncientAlphirine>();
	public static List<TerraFarmlandList> farmlandList = new ArrayList<TerraFarmlandList>();
	public static List<Achievement> achievements = new ArrayList<Achievement>();
	public static List<ItemStack> relicList = new ArrayList<ItemStack>();
	
	public static Item.ToolMaterial mithrilToolMaterial = EnumHelper.addToolMaterial("MITHRIL", 7, -1, 8.0F, 4.0F, 24);
	public static ItemArmor.ArmorMaterial nebulaArmorMaterial = EnumHelper.addArmorMaterial("NEBULA", 0, new int[] { (int)(3 * ConfigABHandler.protectionFactorNebula), (int)(8 * ConfigABHandler.protectionFactorNebula), (int)(6 * ConfigABHandler.protectionFactorNebula), (int)(3 * ConfigABHandler.protectionFactorNebula) }, 26);
	public static ItemArmor.ArmorMaterial wildHundArmor = EnumHelper.addArmorMaterial("WILD_HUNT_MATERIAL", 34, new int[] { 7, 8, 3, 2 }, 26);
	
	public static EnumRarity rarityNebula = EnumHelper.addRarity("NEBULA", EnumChatFormatting.LIGHT_PURPLE, "Nebula");
	public static EnumRarity rarityWildHunt = EnumHelper.addRarity("WILD_HUNT", EnumChatFormatting.AQUA, "WildHunt");
	
	public static RecipeAdvancedPlate registerAdvancedPlateRecipe(ItemStack output, ItemStack input1, ItemStack input2, ItemStack input3, int mana, int color) {
		RecipeAdvancedPlate recipe = new RecipeAdvancedPlate(output, mana, color, input1, input2, input3);
		advancedPlateRecipes.add(recipe);
		return recipe;
	}
	
	public static RecipeAncientAlphirine registerAlphirineRecipe(ItemStack output, ItemStack input, int chance) {
		RecipeAncientAlphirine recipe = new RecipeAncientAlphirine(output, input, chance);
		alphirineRecipes.add(recipe);
		return recipe;
	}
	
	public static TerraFarmlandList registerFarmlandSeed(Block block, int meta) {
		TerraFarmlandList seed = new TerraFarmlandList(block, meta);
		farmlandList.add(seed);
		return seed;
	}
}