package com.almightyelement.thirteen.objects.item;

import com.almightyelement.thirteen.Main;
import com.almightyelement.thirteen.init.ModBlocks;
import com.almightyelement.thirteen.init.ModItems;
import com.almightyelement.thirteen.items.BlockBase;
import com.almightyelement.thirteen.items.ItemBase;
import com.almightyelement.thirteen.util.interfaces.IHasModel;
import com.mojang.realmsclient.dto.PlayerInfo;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Saw extends ItemBase implements IHasModel{
	
	public Saw(String name){
		super(name);
	}
	
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitx, float hity, float hitz)
	{
		
		ItemStack item = playerIn.getHeldItem(hand);
		IBlockState block = Blocks.LOG.getDefaultState();
		Block clickedBlock = worldIn.getBlockState(pos).getBlock();
		
			if (clickedBlock == block)
			{
				
				worldIn.setBlockState(pos, ModBlocks.STRIPPED_LOG.getDefaultState());
                System.out.println("The system succeeded.");
                return EnumActionResult.PASS;
                
			}	
		
			else
			{
				
			System.out.println("The system failed.");
			return EnumActionResult.FAIL;
			
			}
			
		}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}



