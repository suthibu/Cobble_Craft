package net.suthibu.cobblecraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suthibu.cobblecraft.Cobble_Craft;
import net.suthibu.cobblecraft.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cobble_Craft.MOD_ID);

    public static final DeferredItem<Item> COBBLESTONEBOARD = ITEMS.register("cobblestoneboard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAINBOWBOARD = ITEMS.register("rainbowboard",
            () -> new Item(new Item.Properties()));
    public  static final DeferredItem<Item> THINKING_FOOD = ITEMS.register("thinking_food",
            () -> new Item(new Item.Properties().food(ModFoodProperties.THINKING_FOOD)));
    public static final DeferredItem<Item> THINKING_COAL = ITEMS.register("thinking_coal",
            () -> new FuelItem(new Item.Properties(), 2147483647));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
