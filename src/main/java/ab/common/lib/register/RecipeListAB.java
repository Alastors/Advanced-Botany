package ab.common.lib.register;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.KnowledgeType;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.recipe.RecipePetals;
import vazkii.botania.common.Botania;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.block.ModFluffBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.lexicon.BLexiconCategory;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.RLexiconEntry;
import vazkii.botania.common.lexicon.page.PageImage;
import vazkii.botania.common.lexicon.page.PageText;
import ab.api.AdvancedBotanyAPI;
import ab.api.recipe.RecipeAdvancedPlate;
import ab.api.recipe.RecipeAncientAlphirine;
import ab.api.recipe.lexicon.AdvancedPlateCraftPage;
import ab.api.recipe.lexicon.AlphirineCraftPage;
import ab.common.block.tile.TileLebethronCore;
import ab.common.core.handler.ConfigABHandler;
import ab.common.item.ItemCraftingPattern;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeListAB {

    public static LexiconCategory categoryForgotten;

    public static RecipeAncientAlphirine lebethroneRecipe;
    public static RecipeAncientAlphirine forgottenLandRecipe;
    public static RecipeAncientAlphirine advancedSparkRecipe;
    public static RecipeAncientAlphirine manaFlowerRecipe;
    public static RecipeAncientAlphirine hopperRecipe;
    public static RecipeAncientAlphirine fateBoardRecipe;

    public static RecipeAdvancedPlate manaStarRecipe;
    public static RecipeAdvancedPlate terrasteelRecipe;
    public static RecipeAdvancedPlate mithrillRecipe;
    public static RecipeAdvancedPlate nebulaRecipe;

    public static RecipePetals alphirineRecipe;
    public static RecipePetals dictariusRecipe;
    public static RecipePetals aspecolusRecipe;
    public static RecipePetals pureGladRecipe;
    public static RecipePetals azartFlowerRecipe;

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
    public static LexiconEntry freyrSlingshot;
    public static LexiconEntry engineerHopper;
    public static LexiconEntry nebulaRod;
    public static LexiconEntry thaumAutoCraft;
    public static LexiconEntry gladious;
    public static LexiconEntry gameBoard;
    public static LexiconEntry fateBoard;
    public static LexiconEntry richesKey;
    public static LexiconEntry cubeWardrobe;
    public static LexiconEntry sphereNavigation;
    public static LexiconEntry hornPlenty;
    public static LexiconEntry sprawlRod;
    public static LexiconEntry azartFlower;
    public static LexiconEntry aquaSword;

    public static KnowledgeType forgotten;

    public static InfusionRecipe enderExample;

    public static void init() {
        relicInit();

        BotaniaAPI.addCategory(categoryForgotten = new BLexiconCategory("forgotten", 5));
        forgotten = BotaniaAPI.registerKnowledgeType("ab_forgotten", EnumChatFormatting.BLUE, false);

        lebethroneRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(BlockListAB.blockLebethron),
                new ItemStack(ModBlocks.dreamwood, 1, 0),
                15);
        forgottenLandRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 3),
                new ItemStack(ModItems.manaResource, 1, 15),
                75);
        advancedSparkRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(ItemListAB.itemAdvancedSpark),
                new ItemStack(ModItems.spark),
                11);
        manaFlowerRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 4),
                new ItemStack(ModBlocks.flower, 1, 32767),
                32);
        hopperRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(BlockListAB.blockEngineerHopper),
                new ItemStack(Blocks.hopper),
                23);
        fateBoardRecipe = AdvancedBotanyAPI.registerAlphirineRecipe(
                new ItemStack(BlockListAB.blockBoardFate, 1, 1),
                new ItemStack(BlockListAB.blockBoardFate),
                60);

        mithrillRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 0),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModBlocks.storage, 1, 0),
                new ItemStack(ModItems.manaResource, 1, 18),
                2500000,
                0x25d6b7);
        terrasteelRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(
                new ItemStack(ModItems.manaResource, 1, 4),
                new ItemStack(ModItems.manaResource, 1, 2),
                new ItemStack(ModItems.manaResource, 1, 0),
                new ItemStack(ModItems.manaResource, 1, 1),
                500000,
                0x29de20);
        manaStarRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 2),
                new ItemStack(ModItems.manaResource, 1, 23),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(Items.nether_star),
                250000,
                0x6bc9ec);
        nebulaRecipe = AdvancedBotanyAPI.registerAdvancedPlateRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                new ItemStack(ModItems.manaResource, 1, 8),
                new ItemStack(ModBlocks.storage, 1, 4),
                new ItemStack(ItemListAB.itemABResource, 1, 1),
                25000000,
                0x8d16e0);

        ancientAlphirine = new BLexiconEntry("ancientAlphirine", categoryForgotten);
        alphirineRecipe = BotaniaAPI.registerPetalRecipe(
                ItemBlockSpecialFlower.ofType("ancientAlphirine"),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.rune, 1, 8),
                new ItemStack(ModItems.rune, 1, 4),
                new ItemStack(ModItems.rune, 1, 5),
                new ItemStack(ModItems.rune, 1, 6),
                new ItemStack(ModItems.rune, 1, 7),
                new ItemStack(ModItems.petal, 1, 1),
                new ItemStack(ModItems.petal, 1, 4));
        ancientAlphirine.setPriority().setKnowledgeType(BotaniaAPI.elvenKnowledge)
                .setLexiconPages(
                        new PageText("0"),
                        new PageText("1"),
                        new PageImage("2", "ab:textures/misc/ancientAlphirine.png"),
                        BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", alphirineRecipe),
                        new AlphirineCraftPage(ancientAlphirine, forgottenLandRecipe.getOutput(), ".alphirineCraft"))
                .setIcon(ItemBlockSpecialFlower.ofType("ancientAlphirine"));

        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockABPlate),
                "MPM",
                " F ",
                "BRB",
                'F',
                new ItemStack(Blocks.anvil),
                'M',
                new ItemStack(ModBlocks.storage),
                'P',
                new ItemStack(ModBlocks.terraPlate),
                'B',
                new ItemStack(ItemListAB.itemABResource, 1, 3),
                'R',
                new ItemStack(ModItems.rune, 1, 3));
        advandedAgglomerationPlate = new BLexiconEntry("advancedPlate", categoryForgotten);
        advandedAgglomerationPlate.setPriority().setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()),
                new AdvancedPlateCraftPage(advandedAgglomerationPlate, terrasteelRecipe.getOutput(), ".abCraft0"),
                new AdvancedPlateCraftPage(advandedAgglomerationPlate, manaStarRecipe.getOutput(), ".abCraft1"))
                .setIcon(new ItemStack(BlockListAB.blockABPlate));

        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockABSpreader),
                "WMW",
                "PSP",
                "WMW",
                'M',
                new ItemStack(ItemListAB.itemABResource, 1, 2),
                'P',
                new ItemStack(ModBlocks.pylon),
                'S',
                new ItemStack(ModBlocks.spreader, 1, 3),
                'W',
                new ItemStack(BlockListAB.blockLebethron, 1, 4));
        lebethronSpreader = new BLexiconEntry("lebethronSpreader", categoryForgotten);
        lebethronSpreader.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(BlockListAB.blockABSpreader));

        addShapelessOreDictRecipe(
                new ItemStack(BlockListAB.blockLebethron, 4, 1),
                new ItemStack(BlockListAB.blockLebethron));
        IRecipe leb1 = getLastRecipe();
        addShapelessOreDictRecipe(
                new ItemStack(BlockListAB.blockLebethron, 1, 2),
                new ItemStack(BlockListAB.blockLebethron, 1, 1),
                new ItemStack(Items.wheat_seeds));
        IRecipe leb2 = getLastRecipe();
        addShapelessOreDictRecipe(
                new ItemStack(BlockListAB.blockLebethron, 1, 3),
                new ItemStack(BlockListAB.blockLebethron),
                new ItemStack(Items.glowstone_dust));
        IRecipe leb3 = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockLebethron, 1, 4),
                "4W5",
                "WPW",
                "6W7",
                'P',
                new ItemStack(ModBlocks.pylon, 1, 1),
                'W',
                new ItemStack(BlockListAB.blockLebethron),
                '4',
                new ItemStack(ModItems.rune, 1, 4),
                '5',
                new ItemStack(ModItems.rune, 1, 5),
                '6',
                new ItemStack(ModItems.rune, 1, 6),
                '7',
                new ItemStack(ModItems.rune, 1, 7));
        IRecipe leb4 = getLastRecipe();
        lebethronWood = new BLexiconEntry("lebethronWood", categoryForgotten);
        lebethronWood.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        new AlphirineCraftPage(lebethronWood, lebethroneRecipe.getOutput(), ".alphirineCraft"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb1),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb2),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb3),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", leb4),
                        new PageText("1"),
                        BotaniaAPI.internalHandler.multiblockPage(".structure", TileLebethronCore.makeMultiblockSet()))
                .setIcon(new ItemStack(BlockListAB.blockLebethron));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemMihrillMultiTool),
                " MB",
                " FM",
                "F  ",
                'F',
                new ItemStack(ModItems.manaResource, 1, 3),
                'B',
                new ItemStack(ModBlocks.livingwood),
                'M',
                new ItemStack(ItemListAB.itemABResource));
        mithrill = new BLexiconEntry("mithrill", categoryForgotten);
        mithrill.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        new AdvancedPlateCraftPage(mithrill, mithrillRecipe.getOutput(), ".abCraft"),
                        new PageText("1"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(ItemListAB.itemMihrillMultiTool));

        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockManaContainer),
                "MGM",
                "LPL",
                "M3M",
                'M',
                new ItemStack(ItemListAB.itemABResource),
                'L',
                new ItemStack(ModBlocks.pool),
                'P',
                new ItemStack(ModBlocks.pylon),
                '3',
                new ItemStack(ModItems.rune, 1, 3),
                'G',
                new ItemStack(ModItems.rune, 1, 15));
        IRecipe cont1 = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockManaContainer, 1, 1),
                "MGM",
                "LPL",
                "M3M",
                'M',
                new ItemStack(ItemListAB.itemABResource, 1, 1),
                'L',
                new ItemStack(ModBlocks.pool, 1, 2),
                'P',
                new ItemStack(ModBlocks.pylon),
                '3',
                new ItemStack(ModItems.rune, 1, 3),
                'G',
                new ItemStack(ModItems.rune, 1, 15));
        IRecipe cont2 = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockManaContainer, 1, 2),
                "MGM",
                "LPL",
                "M3M",
                'M',
                new ItemStack(ItemListAB.itemABResource),
                'L',
                new ItemStack(ModBlocks.pool, 1, 3),
                'P',
                new ItemStack(ModBlocks.pylon),
                '3',
                new ItemStack(ModItems.rune, 1, 3),
                'G',
                new ItemStack(ModItems.rune, 1, 15));
        IRecipe cont3 = getLastRecipe();
        manaContainer = new BLexiconEntry("manaContainer", categoryForgotten);
        manaContainer.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", cont1),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft1", cont2),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft2", cont3),
                        new PageText("1"),
                        new AlphirineCraftPage(manaContainer, advancedSparkRecipe.getOutput(), ".alphirineCraft"))
                .setIcon(new ItemStack(BlockListAB.blockManaContainer));

        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockManaCrystalCube),
                "TST",
                "GWG",
                "DMD",
                'D',
                new ItemStack(ModBlocks.dreamwood),
                'W',
                new ItemStack(ModItems.twigWand, 1, 32767),
                'G',
                new ItemStack(ModBlocks.manaGlass),
                'M',
                new ItemStack(ModItems.manaResource),
                'T',
                new ItemStack(ModItems.manaResource, 1, 18),
                'S',
                new ItemStack(ModItems.spark));
        manaCrystalCube = new BLexiconEntry("manaCrystalCube", BotaniaAPI.categoryMana);
        manaCrystalCube.setKnowledgeType(BotaniaAPI.elvenKnowledge)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(BlockListAB.blockManaCrystalCube));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemTerraHoe),
                "TTL",
                "RW ",
                " W ",
                'T',
                new ItemStack(ModItems.manaResource, 1, 4),
                'L',
                new ItemStack(ModItems.manaResource, 1, 18),
                'W',
                new ItemStack(ModItems.manaResource, 1, 3),
                'R',
                new ItemStack(ModItems.rune, 1, 2));
        terraHoe = new BLexiconEntry("terraHoe", BotaniaAPI.categoryTools);
        terraHoe.setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(ItemListAB.itemTerraHoe));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemMithrillRing),
                "LML",
                "MRM",
                "LML",
                'M',
                new ItemStack(ItemListAB.itemABResource),
                'L',
                new ItemStack(ItemListAB.itemABResource, 1, 1),
                'R',
                new ItemStack(ModItems.manaRingGreater));
        IRecipe ring1 = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaRing),
                "LML",
                "MRM",
                "LML",
                'M',
                new ItemStack(ItemListAB.itemABResource, 1, 6),
                'L',
                new ItemStack(ModItems.manaResource, 1, 5),
                'R',
                new ItemStack(ItemListAB.itemMithrillRing));
        IRecipe ring2 = getLastRecipe();
        manaRings = new BLexiconEntry("manaRings", categoryForgotten);
        manaRings.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft0", ring1),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft1", ring2))
                .setIcon(new ItemStack(ItemListAB.itemMithrillRing));
        AdvancedBotanyAPI.registerFarmlandSeed(Blocks.nether_wart, 3);

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemManaFlower),
                " F ",
                " M ",
                " R ",
                'F',
                new ItemStack(ItemListAB.itemABResource, 1, 4),
                'M',
                new ItemStack(ModItems.manaBottle),
                'R',
                new ItemStack(ModItems.rune, 1, 8));
        manaFlower = new BLexiconEntry("manaFlower", categoryForgotten);
        manaFlower.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        new AlphirineCraftPage(manaFlower, manaFlowerRecipe.getOutput(), ".alphirineCraft"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(ItemListAB.itemManaFlower));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemMithrillSword),
                "  M",
                "SM ",
                "WS ",
                'S',
                new ItemStack(ItemListAB.itemABResource, 1, 6),
                'T',
                new ItemStack(ModItems.terraSword),
                'M',
                new ItemStack(ItemListAB.itemABResource),
                'W',
                new ItemStack(ModItems.manaResource, 1, 3));
        mithrillSword = new BLexiconEntry("mithrillSword", categoryForgotten);
        mithrillSword.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        new PageText("1"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(ItemListAB.itemMithrillSword));

        dictariusRecipe = BotaniaAPI.registerPetalRecipe(
                ItemBlockSpecialFlower.ofType("dictarius"),
                new ItemStack(ItemListAB.itemABResource, 1, 4),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.rune, 1, 15),
                new ItemStack(ModItems.petal, 1, 4),
                new ItemStack(ModItems.petal, 1, 4),
                new ItemStack(ModItems.petal, 1, 1));
        dictarius = new BLexiconEntry("dictarius", BotaniaAPI.categoryGenerationFlowers);
        dictarius.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                new PageText("1"),
                BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", dictariusRecipe));

        nebula = new BLexiconEntry("nebula", categoryForgotten);
        nebula.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                new AdvancedPlateCraftPage(nebula, nebulaRecipe.getOutput(), ".abCraft"));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemBlackHalo),
                " E ",
                "DHD",
                " E ",
                'E',
                new ItemStack(ModItems.manaResource, 1, 7),
                'H',
                new ItemStack(ModItems.autocraftingHalo),
                'D',
                new ItemStack(ModItems.blackHoleTalisman));
        blackHalo = new BLexiconEntry("blackHalo", BotaniaAPI.categoryTools);
        blackHalo.setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemAntigravityCharm),
                " G ",
                "GDG",
                "ERE",
                'E',
                new ItemStack(ModItems.manaResource, 1, 7),
                'G',
                new ItemStack(ModBlocks.elfGlass),
                'D',
                new ItemStack(ModBlocks.floatingFlower, 1, 32767),
                'R',
                new ItemStack(ModItems.rune, 1, 3));
        antigravityCharm = new BLexiconEntry("antigravityCharm", BotaniaAPI.categoryTools);
        antigravityCharm.setKnowledgeType(BotaniaAPI.elvenKnowledge)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()))
                .setIcon(new ItemStack(ItemListAB.itemAntigravityCharm));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaBlaze),
                " N ",
                "MMN",
                "AMN",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 6),
                'A',
                new ItemStack(ItemListAB.itemABResource, 1, 3),
                'M',
                new ItemStack(ModBlocks.storage));
        nebulaBlaze = new BLexiconEntry("nebulaBlaze", categoryForgotten);
        nebulaBlaze.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        if (ConfigABHandler.hasManaCharger) {
            GameRegistry.addShapedRecipe(
                    new ItemStack(BlockListAB.blockManaCharger),

                    "NLN",
                    "MPM",
                    " R ",
                    'N',
                    new ItemStack(ItemListAB.itemABResource, 1, 1),
                    'L',
                    new ItemStack(ModBlocks.livingrock),
                    'M',
                    new ItemStack(ModBlocks.bellows),
                    'P',
                    new ItemStack(ModBlocks.pylon),
                    'R',
                    new ItemStack(ModItems.rune, 1, 8));
            manaCharger = new BLexiconEntry("manaCharger", categoryForgotten);
            manaCharger.setKnowledgeType(forgotten).setLexiconPages(
                    new PageText("0"),
                    BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));
        }

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaHelm),
                "RNR",
                "NHN",
                " E ",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                'R',
                new ItemStack(ModItems.manaResource, 1, 7),
                'H',
                new ItemStack(ModItems.terrasteelHelm),
                'E',
                new ItemStack(ModItems.manaResource, 1, 8));
        IRecipe nHelm = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaChest),
                "RTR",
                "NHN",
                "ENE",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                'R',
                new ItemStack(ModItems.manaResource, 1, 7),
                'H',
                new ItemStack(ModItems.terrasteelChest),
                'E',
                new ItemStack(ModItems.manaResource, 1, 8),
                'T',
                new ItemStack(ModItems.flightTiara, 1, 32767));
        IRecipe nChest = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaLegs),
                "ENE",
                "RHR",
                "NAN",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                'R',
                new ItemStack(ModItems.manaResource, 1, 7),
                'H',
                new ItemStack(ModItems.terrasteelLegs),
                'E',
                new ItemStack(ModItems.manaResource, 1, 8),
                'A',
                new ItemStack(ItemListAB.itemABResource, 1, 3));
        IRecipe nLegs = getLastRecipe();
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaBoots),
                "RBR",
                "NHN",
                " E ",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                'R',
                new ItemStack(ModItems.manaResource, 1, 7),
                'H',
                new ItemStack(ModItems.terrasteelBoots),
                'E',
                new ItemStack(ModItems.manaResource, 1, 8),
                'B',
                new ItemStack(ModItems.speedUpBelt));
        IRecipe nBoots = getLastRecipe();
        nebulaArmor = new BLexiconEntry("nebulaArmor", categoryForgotten);
        nebulaArmor.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                new PageText("1"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft0", nHelm),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft1", nChest),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft2", nLegs),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft3", nBoots));

        engineerHopper = new BLexiconEntry("engineerHopper", categoryForgotten);
        engineerHopper.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                new PageImage("1", "ab:textures/misc/engineerHopper.png"),
                new PageText("2"),
                new PageText("3"),
                new PageText("4"),
                new AlphirineCraftPage(engineerHopper, hopperRecipe.getOutput(), ".alphirineCraft"));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemNebulaRod),
                " WN",
                " RW",
                "W  ",
                'W',
                new ItemStack(ModItems.manaResource, 1, 13),
                'R',
                new ItemStack(ModItems.rune, 1, 8),
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 6));
        nebulaRod = new BLexiconEntry("nebulaRod", categoryForgotten);
        nebulaRod.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockBoardFate),
                "   ",
                "QDQ",
                "MPM",
                'Q',
                new ItemStack(ModFluffBlocks.manaQuartz),
                'D',
                new ItemStack(ModItems.manaResource, 1, 2),
                'M',
                new ItemStack(ModItems.manaResource),
                'P',
                new ItemStack(ModItems.manaResource, 1, 23));
        gameBoard = new BLexiconEntry("gameBoard", BotaniaAPI.categoryMisc);
        gameBoard.setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        fateBoard = new BLexiconEntry("fateBoard", categoryForgotten);
        fateBoard.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                new AlphirineCraftPage(fateBoard, fateBoardRecipe.getOutput(), ".alphirineCraft"));

        freyrSlingshot = new RLexiconEntry(
                "freyrSlingshot",
                BotaniaAPI.categoryAlfhomancy,
                AchievementRegister.relicSlingshot);
        freyrSlingshot.setLexiconPages(new PageText("0"), new PageText("1"));

        richesKey = new RLexiconEntry("richesKey", BotaniaAPI.categoryAlfhomancy, AchievementRegister.relicItemChest);
        richesKey.setLexiconPages(new PageText("0"));

        cubeWardrobe = new RLexiconEntry(
                "cubeWardrobe",
                BotaniaAPI.categoryAlfhomancy,
                AchievementRegister.relicPocketArmor);
        cubeWardrobe.setLexiconPages(new PageText("0"));

        sphereNavigation = new RLexiconEntry(
                "sphereNavigation",
                BotaniaAPI.categoryAlfhomancy,
                AchievementRegister.sphereNavigation);
        sphereNavigation.setLexiconPages(new PageText("0"));

        hornPlenty = new RLexiconEntry("hornPlenty", BotaniaAPI.categoryAlfhomancy, AchievementRegister.hornPlenty);
        hornPlenty.setLexiconPages(new PageText("0"));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemSprawlRod),

                " SC",
                " WS",
                "W  ",
                'S',
                new ItemStack(ModItems.grassSeeds, 1, 32767),
                'C',
                new ItemStack(BlockListAB.blockLebethron, 1, 4),
                'W',
                new ItemStack(ModItems.manaResource, 1, 3));
        sprawlRod = new BLexiconEntry("sprawlRod", categoryForgotten);
        sprawlRod.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        azartFlowerRecipe = BotaniaAPI.registerPetalRecipe(
                ItemBlockSpecialFlower.ofType("ardentAzarcissus"),
                new ItemStack(ItemListAB.itemABResource, 1, 4),
                new ItemStack(ModItems.petal, 1, 11),
                new ItemStack(ModItems.petal, 1, 11),
                new ItemStack(ModItems.petal, 1, 14),
                new ItemStack(ModItems.petal, 1, 14),
                new ItemStack(ModItems.petal, 1, 13),
                new ItemStack(ModItems.manaResource, 1, 5));
        azartFlower = new BLexiconEntry("azartFlower", BotaniaAPI.categoryGenerationFlowers);
        azartFlower.setKnowledgeType(forgotten).setLexiconPages(

                new PageText("0"),
                BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", azartFlowerRecipe));

        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemAquaSword),
                "  N",
                "RM ",
                "WR ",
                'N',
                new ItemStack(ItemListAB.itemABResource, 1, 1),
                'M',
                new ItemStack(ItemListAB.itemABResource),
                'R',
                new ItemStack(ModItems.rune),
                'W',
                new ItemStack(ModItems.manaResource, 1, 13));
        aquaSword = new BLexiconEntry("aquaSword", categoryForgotten);
        aquaSword.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.craftingRecipePage(".craft", getLastRecipe()));

        if (Botania.thaumcraftLoaded) thaumcraft();

        addShapelessOreDictRecipe(
                new ItemStack(ItemListAB.itemABResource, 9, 1),
                new ItemStack(ItemListAB.itemABResource));
        addShapelessOreDictRecipe(
                new ItemStack(ItemListAB.itemABResource, 9, 0),
                new ItemStack(BlockListAB.blockABStorage));
        addShapelessOreDictRecipe(
                new ItemStack(ItemListAB.itemABResource, 9, 6),
                new ItemStack(ItemListAB.itemABResource, 1, 5));
        GameRegistry.addShapedRecipe(
                new ItemStack(BlockListAB.blockABStorage),
                "III",
                "III",
                "III",
                'I',
                new ItemStack(ItemListAB.itemABResource));
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemListAB.itemABResource, 1, 5),
                "III",
                "III",
                "III",
                'I',
                new ItemStack(ItemListAB.itemABResource, 1, 6));
    }

    public static void thaumcraft() {
        aspecolus = new BLexiconEntry("aspecolus", BotaniaAPI.categoryFunctionalFlowers);
        aspecolusRecipe = BotaniaAPI.registerPetalRecipe(
                ItemBlockSpecialFlower.ofType("aspecolus"),
                new ItemStack(ModItems.manaResource, 1, 6),
                new ItemStack(ModItems.manaResource, 1, 5),
                new ItemStack(ModItems.rune, 1, 1),
                new ItemStack(ModItems.rune),
                new ItemStack(ItemListAB.itemABResource, 1, 2),
                new ItemStack(ModItems.petal, 1, 10),
                new ItemStack(ModItems.petal, 1, 13));

        // TODO: Below you will find how to make an Infusion Recipe
        enderExample = ThaumcraftApi.addInfusionCraftingRecipe(
                "AB_EnderExample", // TODO: This is the required research
                new ItemStack(ItemListAB.itemAdvancedSpark), // TODO: This is the produced item
                8, // TODO: This is the instability
                /*
                 * TODO: Below is the aspect list of essentia sucked up by the infusion 1 aer, 2 ignis, 3 aqua, 4 terra,
                 * 5 ordo, 6 perditio
                 */
                new AspectList().add(Aspect.AIR, 1).add(Aspect.FIRE, 2).add(Aspect.WATER, 3).add(Aspect.EARTH, 4)
                        .add(Aspect.ORDER, 5).add(Aspect.ENTROPY, 6),
                new ItemStack(ModItems.spark), // TODO: This is the item in the center pedestal
                new ItemStack[] { // TODO: Below are the items in the non-center pedestals
                        new ItemStack(ConfigItems.itemSanitySoap), // TODO: 1 Sanity Soap
                        new ItemStack(ModItems.manaBottle), // TODO: 1 Mana Bottle
                        new ItemStack(ConfigItems.itemSanitySoap), // TODO: 1 Sanity Soap
                        new ItemStack(ModItems.manaBottle) // TODO: 1 Mana Bottle
                } // TODO: Total 2 Sanity Soap, 2 Mana Bottles, 1 Spark
        );
        // TODO: However, I did not make AB_EnderExample so this won't show up

        aspecolus.setKnowledgeType(forgotten)
                .setLexiconPages(
                        new PageText("0"),
                        BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", aspecolusRecipe))
                .setIcon(ItemBlockSpecialFlower.ofType("aspecolus"));
        addShapelessOreDictRecipe(
                new ItemStack(ItemListAB.itemNebulaHelmReveal),
                new ItemStack(ItemListAB.itemNebulaHelm),
                new ItemStack(ConfigItems.itemGoggles));

        if (ConfigABHandler.hasAutoThaum) {
            List<IRecipe> recipes = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                boolean[][] patterns = ItemCraftingPattern.getPattern(i);
                List<String> str = new ArrayList<>();
                for (int j = 0; j < Objects.requireNonNull(patterns).length; j++) {
                    StringBuilder str1 = new StringBuilder();
                    for (int k = 0; k < patterns[j].length; k++) str1.append(patterns[j][k] ? "T" : "H");
                    str.add(str1.toString());
                }
                GameRegistry.addShapedRecipe(
                        new ItemStack(ItemListAB.itemCraftingPattern, 1, i),
                        str.get(0),
                        str.get(1),
                        str.get(2),
                        'T',
                        new ItemStack(ItemListAB.itemCraftingPattern),
                        'H',
                        new ItemStack(ConfigItems.itemNugget, 1, 6));
                recipes.add(getLastRecipe());
            }
            IRecipe crate = GameRegistry.addShapedRecipe(
                    new ItemStack(BlockListAB.blockMagicCraftCrate),
                    "TST",
                    "WCW",
                    "W W",
                    'W',
                    new ItemStack(ConfigBlocks.blockMagicalLog),
                    'S',
                    new ItemStack(ConfigItems.itemResource, 1, 14),
                    'T',
                    new ItemStack(ConfigItems.itemResource, 1, 7),
                    'C',
                    new ItemStack(ModBlocks.openCrate, 1, 1));
            addShapelessOreDictRecipe(
                    new ItemStack(ItemListAB.itemCraftingPattern, 48),
                    new ItemStack(Blocks.crafting_table),
                    new ItemStack(ModBlocks.livingrock),
                    new ItemStack(ConfigItems.itemResource, 1, 14));
            thaumAutoCraft = new BLexiconEntry("thaumAutoCraft", BotaniaAPI.categoryDevices);
            thaumAutoCraft.setKnowledgeType(BotaniaAPI.elvenKnowledge).setLexiconPages(
                    new PageText("0"),
                    BotaniaAPI.internalHandler.craftingRecipePage(".craft", crate),
                    BotaniaAPI.internalHandler.craftingRecipePage(".craft0", getLastRecipe()),
                    BotaniaAPI.internalHandler.craftingRecipesPage(".craft1", recipes));

        }

        pureGladRecipe = BotaniaAPI.registerPetalRecipe(
                ItemBlockSpecialFlower.ofType("pureGladiolus"),
                new ItemStack(ItemListAB.itemABResource, 1, 4),
                new ItemStack(ModItems.rune, 1, 8),
                new ItemStack(ModItems.petal, 1, 8),
                new ItemStack(ModItems.petal, 1, 4),
                new ItemStack(ModItems.petal, 1, 14),
                new ItemStack(ModItems.petal, 1, 5),
                new ItemStack(ModItems.petal, 1, 13),
                new ItemStack(ModItems.petal, 1, 11));
        gladious = new BLexiconEntry("gladious", BotaniaAPI.categoryFunctionalFlowers);
        gladious.setKnowledgeType(forgotten).setLexiconPages(
                new PageText("0"),
                BotaniaAPI.internalHandler.petalRecipePage(".petalCraft", pureGladRecipe));
    }

    public static void relicInit() {
        AdvancedBotanyAPI.diceList.add(new ItemStack(ModItems.dice));

        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.infiniteFruit));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.kingKey));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.flugelEye));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.thorRing));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.odinRing));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ModItems.lokiRing));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ItemListAB.itemFreyrSlingshot));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ItemListAB.itemTalismanHiddenRiches));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ItemListAB.itemPocketWardrobe));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ItemListAB.itemSphereNavigation));
        AdvancedBotanyAPI.relicList.add(new ItemStack(ItemListAB.itemHornPlenty));
    }

    private static IRecipe getLastRecipe() {
        return (IRecipe) CraftingManager.getInstance().getRecipeList()
                .get(CraftingManager.getInstance().getRecipeList().size() - 1);
    }

    private static void addOreDictRecipe(ItemStack output, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, recipe));
    }

    private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(output, recipe));
    }
}
