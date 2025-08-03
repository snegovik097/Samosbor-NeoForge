package org.sneg.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.sneg.SamosborMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamosborMod.MOD_ID);

    public static final DeferredItem<Item> RAKE = ITEMS.register("rake",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GAS_MASK = ITEMS.register("gas_mask",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}