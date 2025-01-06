package com.teamabnormals.template_mod.core.registry;

import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.template_mod.core.TemplateMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = TemplateMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class TemplateBlocks {
	public static final BlockSubRegistryHelper HELPER = TemplateMod.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> TEMPLATE_BLOCK = HELPER.createBlock("template_block", () -> new Block(Block.Properties.copy(Blocks.STONE)));

	public static void setupTabEditors() {
		CreativeModeTabContentsPopulator.mod(TemplateMod.MOD_ID);
	}
}
