package com.almightyelement.thirteen.proxy;

import com.almightyelement.thirteen.objects.item.Saw;

import net.minecraft.item.Item;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id){}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	public void registerModel(Item itemFromBlock, int i) {}
	
}