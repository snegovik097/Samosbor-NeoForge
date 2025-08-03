package org.sneg.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.sneg.SamosborMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SamosborMod.MOD_ID);

    public static final Supplier<CreativeModeTab> SAMOSBOR = CREATIVE_MODE_TAB.register("samosbor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GAS_MASK.get()))
                    .title(Component.translatable("creativetab.samasbor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAKE);
                        output.accept(ModItems.GAS_MASK);
                        output.accept(ModItems.GAS_MASK_FILTER);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}