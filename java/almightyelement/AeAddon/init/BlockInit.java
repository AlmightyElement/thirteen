package almightyelement.AeAddon.init;

import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.init.blocks.CustomBlock;
import almightyelement.AeAddon.init.blocks.CustomBlockStairs;
import almightyelement.AeAddon.init.blocks.CustomIngotBlock;
import almightyelement.AeAddon.init.blocks.CustomLightBlock;
import almightyelement.AeAddon.init.blocks.CustomLog;
import almightyelement.AeAddon.init.blocks.CustomOre;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockDoubleSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block iskallium;
	public static Block kryptonite_ore, kryptonite_ore_nether, kryptonite_ore_end;
	public static Block kryptonite_block;
	public static Block kryptonite_stairs;
	public static CustomBlockHalfSlab kryptonite_slab_half;
	public static CustomBlockDoubleSlab kryptonite_slab_double;
	public static CustomLog stripped_log;
	public static Block smooth_sandstone;
	public static Block block3;
	public static Block block4;
	
	public static void init()
	{
		iskallium = new CustomLightBlock("iskallium", 2.5F, 4.5F);
		kryptonite_ore = new CustomOre("kryptonite_ore", 2.0F, 4.0F, 2);
		kryptonite_ore_nether = new CustomOre("kryptonite_ore_nether", 2.0F, 4.0F, 2);
		kryptonite_ore_end = new CustomOre("kryptonite_ore_end", 2.0F, 4.0F, 2);
		kryptonite_block = new CustomIngotBlock("kryptonite_block", 2.5F, 4.5F, 2);
		kryptonite_stairs = new CustomBlockStairs("kryptonite_stairs", kryptonite_block.getDefaultState());
		kryptonite_slab_half = new CustomBlockHalfSlab("kryptonite_slab_half", 2.5F, 4.5F);
		kryptonite_slab_double = new CustomBlockDoubleSlab("kryptonite_slab_double", 2.5F, 4.5F);
		stripped_log = new CustomLog("stripped_log",2.5F, 4.5F);
		smooth_sandstone = new CustomBlock("smooth_sandstone",2.5F, 4.5F);
		block3 = new CustomBlock("Block3",2.5F, 4.5F);
		block4 = new CustomBlock("Block4",2.5F, 4.5F);
		
	}
	
	public static void register()
	{
		registerBlock(iskallium);
		registerBlock(kryptonite_ore);
		registerBlock(kryptonite_ore_nether);
		registerBlock(kryptonite_ore_end);
		registerBlock(kryptonite_block);
		registerBlock(kryptonite_stairs);
		registerBlock(kryptonite_slab_half, new ItemSlab(kryptonite_slab_half, kryptonite_slab_half, kryptonite_slab_double));
		ForgeRegistries.BLOCKS.register(kryptonite_slab_double);
		registerBlock(stripped_log);
		registerBlock(smooth_sandstone);
		registerBlock(block3);
		registerBlock(block4);
	
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(ModClass.kryptonitetab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), null));
	}
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(ModClass.kryptonitetab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), null));

	}

	}
