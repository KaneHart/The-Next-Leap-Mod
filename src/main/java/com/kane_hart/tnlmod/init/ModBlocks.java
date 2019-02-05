package com.kane_hart.tnlmod.init;

import java.util.ArrayList;
import java.util.List;

import com.kane_hart.tnlmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SILVER_INFUSED_STEEL_BLOCK = new BlockBase("silver_infused_steel_block", Material.IRON);
	public static final Block SILVER_INFUSED_STEEL_MACHINE = new BlockBase("silver_infused_steel_machine", Material.IRON);
	public static final Block ADVANCED_SILVER_INFUSED_STEEL_MACHINE = new BlockBase("advanced_silver_infused_steel_machine", Material.IRON);
}
