package net.suthibu.cobblecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suthibu.cobblecraft.Cobble_Craft;
import net.suthibu.cobblecraft.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cobble_Craft.MOD_ID);

    public static final Supplier<CreativeModeTab> COBBLESTONE_ITEM_TAB = CREATIVE_MODE_TAB.register("cobblecraft_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RAINBOWCOBBLESTONE.get()))
                    .title(Component.translatable("creativetab.cobblecraft.cobblecraft_creative_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COBBLESTONEBOARD);
                        output.accept(ModItems.RAINBOWBOARD);
                        output.accept(ModBlocks.ONEMULTIPLIER_COBBLESTONE);
                        output.accept(ModBlocks.TWOMULTIPLIER_COBBLESTONE);
                        output.accept(ModBlocks.THREEMULTIPLIER_COBBLESTONE);
                        output.accept(ModBlocks.RAINBOWCOBBLESTONE);
                        output.accept(ModBlocks.TESTGIF);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
