package net.suthibu.cobblecraft.item;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suthibu.cobblecraft.Cobble_Craft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cobble_Craft.MOD_ID);

    public static final DeferredItem<Item> COBBLESTONEBOARD = ITEMS.register("cobblestoneboard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAINBOWBOARD = ITEMS.register("rainbowboard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
