package com.teamabnormals.template_mod.core.registry;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamabnormals.template_mod.core.TemplateMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = TemplateMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class TemplateItems {
	public static final ItemSubRegistryHelper HELPER = TemplateMod.REGISTRY_HELPER.getItemSubHelper();

	public static final RegistryObject<Item> TEMPLATE_ITEM = HELPER.createItem("template_item", () -> new Item(new Item.Properties()));
}