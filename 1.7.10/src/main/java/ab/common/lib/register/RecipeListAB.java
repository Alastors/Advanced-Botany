package ab.common.lib.register;

import ab.api.AdvancedBotanyAPI;
import ab.api.recipe.RecipeAdvancedPlate;
import ab.api.recipe.RecipeAncientAlphirine;
import ab.api.recipe.lexicon.AdvancedPlateCraftPage;
import ab.api.recipe.lexicon.AlphirineCraftPage;
import ab.common.block.tile.TileAgglomerationPlate;
import ab.common.block.tile.TileLebethronCore;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import thaumcraft.common.config.ConfigItems;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.KnowledgeType;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.lexicon.LexiconPage;
import vazkii.botania.api.recipe.RecipePetals;
import vazkii.botania.common.Botania;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.lexicon.BLexiconCategory;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.page.PageText;

public class RecipeListAB {

	public static LexiconCategory categoryForgotten;
	
	public static RecipeAncientAlphirine lebethroneRecipe;
	public static RecipeAncientAlphirine forgottenLandRecipe;
	public static RecipeAncientAlphirine advancedSparkRecipe;
	public static RecipeAncientAlphirine manaFlowerRecipe;
	
	public static RecipeAdvancedPlate manaStarRecipe;
	public static RecipeAdvancedPlate terrasteelRecipe;
	public static RecipeAdvancedPlate mithrillRecipe;
	public static RecipeAdvancedPlate nebulaRecipe;
	
	public static RecipePetals alphirineRecipe;
	public static RecipePetals dictariusRecipe;
	public static RecipePetals aspecolusRecipe;
	
	public static LexiconEntry advandedAgglomerationPlate;
	public static LexiconEntry ancientAlphirine;
	public static LexiconEntry lebethronWood;
	public static LexiconEntry lebethronSpreader;
	public static LexiconEntry mithrill;
	public static LexiconEntry manaContainer;
	public static LexiconEntry manaCrystalCube;
	public static LexiconEntry terraHoe;
	public static LexiconEntry manaRings;
	public static LexiconEntry manaFlower;
	public static LexiconEntry mithrillSword;
	public static LexiconEntry nebula;
	public static LexiconEntry blackHalo;
	public static LexiconEntry antigravityCharm;
	public static LexiconEntry nebulaBlaze;
	public static LexiconEntry aspecolus;
	public static LexiconEntry dictarius;
	public static LexiconEntry manaCharger;
	public static LexiconEntry nebulaArmor;
	
	public static KnowledgeType forgotten;
	
	public static void init() {
		
		BotaniaAPI.addCategory(categoryForgotten = new BLexiconCategory("forgotten", 5));
		forgotten = BotaniaAPI.registerKnowledgeType("ab_forgotten", EnumChatFormatting.BLUE, false);
		
		lebethroneRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(new ItemStack(BlockListAB.blockLebethron), new ItemStack(ModBlocks.dreamwood, 1, 0), 15);
		forgottenLandRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(new ItemStack(ItemListAB.itemABResource, 1, 3), new ItemStack(ModItems.manaResource, 1, 15), 75);
		advancedSparkRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(new ItemStack(ItemListAB.itemAdvancedSpark), new ItemStack(ModItems.spark), 11);
		manaFlowerRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(new ItemStack(ItemListAB.itemABResource, 1, 4), new ItemStack(ModBlocks.flower, 1, 32767), 32);
		
		mithrillRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(new ItemStack(ItemListAB.itemABResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModBlocks.storage, 1, 0), new ItemStack(ModItems.manaResource, 1, 18), 7500000);
		terrasteelRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(new ItemStack(ModItems.manaResource, 1, 4), new ItemStack(ModItems.manaResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 0), new ItemStack(ModItems.manaResource, 1, 1), 500000);
		manaStarRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(new ItemStack(ItemListAB.itemABResource, 1, 2), new ItemStack(ModItems.manaResource, 1, 23), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(Items.nether_star), 250000);
		nebulaRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(new ItemStack(ItemListAB.itemABResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 8), new ItemStack(ModBlocks.storage, 1, 4), new ItemStack(ItemListAB.itemABResource, 1, 1), 50000000);
		
		ancientAlphirine = new BLexiconEntry("ancientAlphirine", categoryForgotten);
		alphirineRecipe = BotaniaAPI.registerPetalRecipe(ItemBlockSpecialFlower.ofType("ancientAlphirine"), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.rune, 1, 8), new ItemStack(ModItems.rune, 1, 4), new ItemStack(ModItems.rune, 1, 5), new ItemStack(ModItems.rune, 1, 6), new ItemStack(ModItems.rune, 1, 7), new ItemStack(ModItems.petal, 1, 1), new ItemStack(ModItems.petal, 1, 4));
		ancientAlphirine.setPriority().setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(new LexiconPage[] { new PageText("0"), new PageText("1"), BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", alphirineRecipe), new AlphirineCraftPage(forgottenLandRecipe) }).setIcon(ItemBlockSpecialFlower.ofType("ancientAlphirine"));
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockABPlate), new Object[] { "   ", "MPM", "BRB", Character.valueOf('M'), new ItemStack(ModBlocks.storage), Character.valueOf('P'), new ItemStack(ModBlocks.terraPlate), Character.valueOf('B'), new ItemStack(ItemListAB.itemABResource, 1, 3), Character.valueOf('R'), new ItemStack(ModItems.rune, 1, 3)});
		advandedAgglomerationPlate = new BLexiconEntry("advancedPlate", categoryForgotten);
		advandedAgglomerationPlate.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] {new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()), BotaniaAPI.internalHandler.multiblockPage(".structure", TileAgglomerationPlate.makeMultiblockSet()), new AdvancedPlateCraftPage(terrasteelRecipe, "0"), new AdvancedPlateCraftPage(manaStarRecipe, "1") }).setIcon(new ItemStack(BlockListAB.blockABPlate));

		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockABSpreader), new Object[] { "WMW", "PSP", "WMW", Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource, 1, 2), Character.valueOf('P'), new ItemStack(ModBlocks.pylon), Character.valueOf('S'), new ItemStack(ModBlocks.spreader, 1, 3), Character.valueOf('W'), new ItemStack(BlockListAB.blockLebethron, 1, 4)});
		lebethronSpreader = new BLexiconEntry("lebethronSpreader", categoryForgotten);
		lebethronSpreader.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()) }).setIcon(new ItemStack(BlockListAB.blockABSpreader));
		
		addShapelessOreDictRecipe(new ItemStack(BlockListAB.blockLebethron, 4, 1), new Object[] { new ItemStack(BlockListAB.blockLebethron)});
		IRecipe leb1 = getLastRecipe();
		addShapelessOreDictRecipe(new ItemStack(BlockListAB.blockLebethron, 1, 2), new Object[] { new ItemStack(BlockListAB.blockLebethron, 1, 1), new ItemStack(Items.wheat_seeds)});
		IRecipe leb2 = getLastRecipe();
		addShapelessOreDictRecipe(new ItemStack(BlockListAB.blockLebethron, 1, 3), new Object[] { new ItemStack(BlockListAB.blockLebethron), new ItemStack(Items.glowstone_dust)});
		IRecipe leb3 = getLastRecipe();
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockLebethron, 1, 4), new Object[] { "4W5", "WPW", "6W7", Character.valueOf('P'), new ItemStack(ModBlocks.pylon, 1, 1), Character.valueOf('W'), new ItemStack(BlockListAB.blockLebethron), Character.valueOf('4'), new ItemStack(ModItems.rune, 1, 4), Character.valueOf('5'), new ItemStack(ModItems.rune, 1, 5), Character.valueOf('6'), new ItemStack(ModItems.rune, 1, 6), Character.valueOf('7'), new ItemStack(ModItems.rune, 1, 7)});
		IRecipe leb4 = getLastRecipe();
		lebethronWood = new BLexiconEntry("lebethronWood", categoryForgotten);
		lebethronWood.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), new AlphirineCraftPage(lebethroneRecipe), BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb1), BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb2), BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb3), BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb4), new PageText("1"), BotaniaAPI.internalHandler.multiblockPage(".structure", TileLebethronCore.makeMultiblockSet()) }).setIcon(new ItemStack(BlockListAB.blockLebethron));

		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemMihrillMultiTool), new Object[] { " MB", " FM", "F  ", Character.valueOf('F'), new ItemStack(ModItems.manaResource, 1, 3), Character.valueOf('B'), new ItemStack(ModBlocks.livingwood), Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource)});
		mithrill = new BLexiconEntry("mithrill", categoryForgotten);
		mithrill.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), new AdvancedPlateCraftPage(mithrillRecipe), new PageText("1"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()) }).setIcon(new ItemStack(ItemListAB.itemMihrillMultiTool));
				
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockManaContainer), new Object[] { "MGM", "LPL", "M3M", Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource), Character.valueOf('L'), new ItemStack(ModBlocks.pool), Character.valueOf('P'), new ItemStack(ModBlocks.pylon), Character.valueOf('3'), new ItemStack(ModItems.rune, 1, 3), Character.valueOf('G'), new ItemStack(ModItems.rune, 1, 15)});
		manaContainer = new BLexiconEntry("manaContainer", categoryForgotten);
		manaContainer.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()), new PageText("1"), new AlphirineCraftPage(advancedSparkRecipe) }).setIcon(new ItemStack(BlockListAB.blockManaContainer));
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockManaCrystalCube), new Object[] { "TST", "GWG", "DMD", Character.valueOf('D'), new ItemStack(ModBlocks.dreamwood), Character.valueOf('W'), new ItemStack(ModItems.twigWand, 1, 32767), Character.valueOf('G'), new ItemStack(ModBlocks.manaGlass), Character.valueOf('M'), new ItemStack(ModItems.manaResource), Character.valueOf('T'), new ItemStack(ModItems.manaResource, 1, 18), Character.valueOf('S'), new ItemStack(ModItems.spark)});
		manaCrystalCube = new BLexiconEntry("manaCrystalCube", BotaniaAPI.categoryMana);
		manaCrystalCube.setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()) }).setIcon(new ItemStack(BlockListAB.blockManaCrystalCube));
	
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemTerraHoe), new Object[] { "TTL", "RW ", " W ", Character.valueOf('T'), new ItemStack(ModItems.manaResource, 1, 4), Character.valueOf('L'), new ItemStack(ModItems.manaResource, 1, 18), Character.valueOf('W'), new ItemStack(ModItems.manaResource, 1, 3), Character.valueOf('R'), new ItemStack(ModItems.rune, 1, 2)});
		terraHoe = new BLexiconEntry("terraHoe", BotaniaAPI.categoryTools);
		terraHoe.setLexiconPages(new LexiconPage[]{ new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()) }).setIcon(new ItemStack(ItemListAB.itemTerraHoe));
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemMithrillRing), new Object[] { "LML", "MRM", "LML", Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource), Character.valueOf('L'), new ItemStack(ItemListAB.itemABResource, 1, 1), Character.valueOf('R'), new ItemStack(ModItems.manaRingGreater)});
		IRecipe ring1 = getLastRecipe();
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaRing), new Object[] { "LML", "MRM", "LML", Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource, 1, 6), Character.valueOf('L'), new ItemStack(ModItems.manaResource, 1, 5), Character.valueOf('R'), new ItemStack(ItemListAB.itemMithrillRing)});
		IRecipe ring2 = getLastRecipe();
		manaRings = new BLexiconEntry("manaRings", categoryForgotten);
		manaRings.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[]{ new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft0", ring1), BotaniaAPI.internalHandler.craftingRecipePage(".craft1", ring2)}).setIcon(new ItemStack(ItemListAB.itemMithrillRing));
		AdvancedBotanyAPI.registerFarmlandSeed(Blocks.nether_wart, 3);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemManaFlower), new Object[] { " F ", " M ", " R ", Character.valueOf('F'), new ItemStack(ItemListAB.itemABResource, 1, 4), Character.valueOf('M'), new ItemStack(ModItems.manaBottle), Character.valueOf('R'), new ItemStack(ModItems.rune, 1, 8)});
		manaFlower = new BLexiconEntry("manaFlower", categoryForgotten);
		manaFlower.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), new AlphirineCraftPage(manaFlowerRecipe), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe())}).setIcon(new ItemStack(ItemListAB.itemManaFlower));
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemMithrillSword), new Object[] { "  M", "SM ", "WS ", Character.valueOf('S'), new ItemStack(ItemListAB.itemABResource, 1, 6), Character.valueOf('T'), new ItemStack(ModItems.terraSword), Character.valueOf('M'), new ItemStack(ItemListAB.itemABResource), Character.valueOf('W'), new ItemStack(ModItems.manaResource, 1, 3)});
		mithrillSword = new BLexiconEntry("mithrillSword", categoryForgotten);
		mithrillSword.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()) }).setIcon(new ItemStack(ItemListAB.itemMithrillSword));		
		
		dictariusRecipe = BotaniaAPI.registerPetalRecipe(ItemBlockSpecialFlower.ofType("dictarius"), new ItemStack(ItemListAB.itemABResource, 1, 4), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.rune, 1, 15), new ItemStack(ModItems.petal, 1, 4), new ItemStack(ModItems.petal, 1, 4), new ItemStack(ModItems.petal, 1, 1));
		dictarius = new BLexiconEntry("dictarius", BotaniaAPI.categoryGenerationFlowers);
		dictarius.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", dictariusRecipe)});

		nebula = new BLexiconEntry("nebula", categoryForgotten);
		nebula.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), new AdvancedPlateCraftPage(nebulaRecipe)});
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemBlackHalo), new Object[] { " E ", "DHD", " E ", Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('H'), new ItemStack(ModItems.autocraftingHalo), Character.valueOf('D'), new ItemStack(ModItems.blackHoleTalisman)});
		blackHalo = new BLexiconEntry("blackHalo", BotaniaAPI.categoryTools);
		blackHalo.setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe())});
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemAntigravityCharm), new Object[] { " G ", "GDG", "ERE", Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('G'), new ItemStack(ModBlocks.elfGlass), Character.valueOf('D'), new ItemStack(ModBlocks.floatingFlower, 1, 32767), Character.valueOf('R'), new ItemStack(ModItems.rune, 1, 3)});
		antigravityCharm = new BLexiconEntry("antigravityCharm", BotaniaAPI.categoryTools);
		antigravityCharm.setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe())}).setIcon(new ItemStack(ItemListAB.itemAntigravityCharm));
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaBlaze), new Object[] { " N ", "MMN", "AMN", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 6), Character.valueOf('A'), new ItemStack(ItemListAB.itemABResource, 1, 3), Character.valueOf('M'), new ItemStack(ModBlocks.storage)});
		nebulaBlaze = new BLexiconEntry("nebulaBlaze", categoryForgotten);
		nebulaBlaze.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe())});
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockManaCharger), new Object[] { "NLN", "MPM", " R ", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 1), Character.valueOf('L'), new ItemStack(ModBlocks.livingrock), Character.valueOf('M'), new ItemStack(ModBlocks.bellows), Character.valueOf('P'), new ItemStack(ModBlocks.pylon), Character.valueOf('R'), new ItemStack(ModItems.rune, 1, 8)});
		manaCharger = new BLexiconEntry("manaCharger", categoryForgotten);
		manaCharger.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe())});
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaHelm), new Object[] { "RNR", "NHN", " E ", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 5), Character.valueOf('R'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('H'), new ItemStack(ModItems.terrasteelHelm), Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 8)});
		IRecipe nHelm = getLastRecipe();
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaChest), new Object[] { "RTR", "NHN", "ENE", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 5), Character.valueOf('R'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('H'), new ItemStack(ModItems.terrasteelChest), Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 8), Character.valueOf('T'), new ItemStack(ModItems.flightTiara, 1, 32767)});
		IRecipe nChest = getLastRecipe();
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaLegs), new Object[] { "ENE", "RHR", "NAN", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 5), Character.valueOf('R'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('H'), new ItemStack(ModItems.terrasteelLegs), Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 8), Character.valueOf('A'), new ItemStack(ItemListAB.itemABResource, 1, 3)});
		IRecipe nLegs = getLastRecipe();
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemNebulaBoots), new Object[] { "RBR", "NHN", " E ", Character.valueOf('N'), new ItemStack(ItemListAB.itemABResource, 1, 5), Character.valueOf('R'), new ItemStack(ModItems.manaResource, 1, 7), Character.valueOf('H'), new ItemStack(ModItems.terrasteelBoots), Character.valueOf('E'), new ItemStack(ModItems.manaResource, 1, 8), Character.valueOf('B'), new ItemStack(ModItems.speedUpBelt)});
		IRecipe nBoots = getLastRecipe();
		
		nebulaArmor = new BLexiconEntry("nebulaArmor", categoryForgotten);
		nebulaArmor.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), new PageText("1"), BotaniaAPI.internalHandler.craftingRecipePage(".craft", nHelm), BotaniaAPI.internalHandler.craftingRecipePage(".craft", nChest), BotaniaAPI.internalHandler.craftingRecipePage(".craft", nLegs), BotaniaAPI.internalHandler.craftingRecipePage(".craft", nBoots)});

		if(Botania.thaumcraftLoaded)
			thaumcraft();
		
		addShapelessOreDictRecipe(new ItemStack(ItemListAB.itemABResource, 9, 1), new Object[] { new ItemStack(ItemListAB.itemABResource)});
		addShapelessOreDictRecipe(new ItemStack(ItemListAB.itemABResource, 9, 0), new Object[] { new ItemStack(BlockListAB.blockABStorage)});
		addShapelessOreDictRecipe(new ItemStack(ItemListAB.itemABResource, 9, 6), new Object[] { new ItemStack(ItemListAB.itemABResource, 1, 5)});
		GameRegistry.addShapedRecipe(new ItemStack(BlockListAB.blockABStorage), new Object[] { "III", "III", "III", Character.valueOf('I'), new ItemStack(ItemListAB.itemABResource)});
		GameRegistry.addShapedRecipe(new ItemStack(ItemListAB.itemABResource, 1, 5), new Object[] { "III", "III", "III", Character.valueOf('I'), new ItemStack(ItemListAB.itemABResource, 1, 6)});
	}
	
	public static void thaumcraft() {
		aspecolus = new BLexiconEntry("aspecolus", BotaniaAPI.categoryFunctionalFlowers);
		aspecolusRecipe = BotaniaAPI.registerPetalRecipe(ItemBlockSpecialFlower.ofType("aspecolus"), new ItemStack(ModItems.manaResource, 1, 6), new ItemStack(ModItems.manaResource, 1, 5), new ItemStack(ModItems.rune, 1, 1), new ItemStack(ModItems.rune), new ItemStack(ItemListAB.itemABResource, 1, 2), new ItemStack(ModItems.petal, 1, 10), new ItemStack(ModItems.petal, 1, 13));
		aspecolus.setKnowledgeType(forgotten).setLexiconPages(new LexiconPage[] { new PageText("0"), BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", aspecolusRecipe) }).setIcon(ItemBlockSpecialFlower.ofType("aspecolus"));
		addShapelessOreDictRecipe(new ItemStack(ItemListAB.itemNebulaHelmReveal), new Object[] { new ItemStack(ItemListAB.itemNebulaHelm), new ItemStack(ConfigItems.itemGoggles)});
	}
	
	private static IRecipe getLastRecipe() {
		return (IRecipe)CraftingManager.getInstance().getRecipeList().get(CraftingManager.getInstance().getRecipeList().size() - 1);
	}
	
	private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, recipe));
	}
}