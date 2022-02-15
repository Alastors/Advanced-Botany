package ab.common.lib.register;

import ab.common.block.BlockABSpreader;
import ab.common.block.BlockABStorage;
import ab.common.block.BlockAgglomerationPlate;
import ab.common.block.BlockAntigravitation;
import ab.common.block.BlockFreyrLiana;
import ab.common.block.BlockLebethronWood;
import ab.common.block.BlockLuminousFreyrLiana;
import ab.common.block.BlockManaCharger;
import ab.common.block.BlockManaContainer;
import ab.common.block.BlockManaCrystalCube;
import ab.common.block.BlockTerraFarmland;
import ab.common.block.tile.TileABSpreader;
import ab.common.block.tile.TileAgglomerationPlate;
import ab.common.block.tile.TileLebethronCore;
import ab.common.block.tile.TileManaCharger;
import ab.common.block.tile.TileManaContainer;
import ab.common.block.tile.TileManaCrystalCube;
import ab.common.item.block.ItemBlockBase;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockListAB {
	
	public static Block blockABSpreader;
	public static Block blockABPlate;
	public static Block blockLebethron;
	public static Block blockManaContainer;
	public static Block blockABStorage;
	public static Block blockManaCrystalCube;
	public static Block blockTerraFarmland;
	public static Block blockAntigravitation;
	public static Block blockManaCharger;
	
	public static Block blockFreyrLiana;
	public static Block blockLuminousFreyrLiana;
	
	public static int blockABSpreaderRI;
	public static int blockManaContainerRI;
	public static int blockManaCrystalCubeRI;
	public static int blockManaChargerRI;
	
	public static void init() {
		initializeBlocks();
		registerBlocks();
		registerTileEntities();
	}
	
	private static void initializeBlocks() {
		BlockListAB.blockABSpreader = new BlockABSpreader();
		BlockListAB.blockABPlate = new BlockAgglomerationPlate();
		BlockListAB.blockLebethron = new BlockLebethronWood();
		BlockListAB.blockManaContainer = new BlockManaContainer();
		BlockListAB.blockABStorage = new BlockABStorage();
		BlockListAB.blockManaCrystalCube = new BlockManaCrystalCube();
		BlockListAB.blockTerraFarmland = new BlockTerraFarmland();
		BlockListAB.blockAntigravitation = new BlockAntigravitation();
		BlockListAB.blockManaCharger = new BlockManaCharger();
		
		//BlockListAB.blockLuminousFreyrLiana = new BlockLuminousFreyrLiana();
		//BlockListAB.blockFreyrLiana = new BlockFreyrLiana();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(BlockListAB.blockABSpreader, "blockABSpreader");
		GameRegistry.registerBlock(BlockListAB.blockABPlate, "blockABPlate");
		GameRegistry.registerBlock(BlockListAB.blockManaContainer, "blockManaContainer");
		GameRegistry.registerBlock(BlockListAB.blockLebethron, ItemBlockBase.class, "blockLebethron");
		GameRegistry.registerBlock(BlockListAB.blockABStorage, ItemBlockBase.class, "blockABStorage");
		GameRegistry.registerBlock(BlockListAB.blockManaCrystalCube, "blockManaCrystalCube");
		GameRegistry.registerBlock(BlockListAB.blockTerraFarmland, "blockTerraFarmland");
		GameRegistry.registerBlock(BlockListAB.blockAntigravitation, "blockAntigravitation");
		GameRegistry.registerBlock(BlockListAB.blockManaCharger, "blockManaCharger");
		
		//GameRegistry.registerBlock(BlockListAB.blockFreyrLiana, "blockFreyrLiana");
		//GameRegistry.registerBlock(BlockListAB.blockLuminousFreyrLiana, "blockLuminousFreyrLiana");
	}
	
	private static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileABSpreader.class, "tileABSpreader");
		GameRegistry.registerTileEntity(TileAgglomerationPlate.class, "tileAgglomerationPlate");
		GameRegistry.registerTileEntity(TileLebethronCore.class, "tileLebethronCore");
		GameRegistry.registerTileEntity(TileManaContainer.class, "tileManaContainer");
		GameRegistry.registerTileEntity(TileManaCrystalCube.class, "tileManaCrystalCube");
		GameRegistry.registerTileEntity(TileManaCharger.class, "tileManaCharger");
	}
	
	static {
		BlockListAB.blockABSpreaderRI = -1;
		BlockListAB.blockManaContainerRI = -1;
		BlockListAB.blockManaCrystalCubeRI = -1;
		BlockListAB.blockManaChargerRI = -1;
	}
}