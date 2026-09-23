package com.trainerredstone7.netheritemoaarmor;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.protect_your_moa.item.ProtectItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@SuppressWarnings({ "removal", "deprecation" })
@EventBusSubscriber(modid = NetheriteMoaArmor.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CreativeTab {
    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab tab = event.getTab();
        if (tab == AetherCreativeTabs.AETHER_ARMOR_AND_ACCESSORIES.get()) {
        	event.insertAfter(new ItemStack(ProtectItems.GRAVITITE_MOA_ARMOR.get()), new ItemStack(NetheriteMoaArmor.NETHERITE_MOA_ARMOR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
