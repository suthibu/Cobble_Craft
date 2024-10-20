package net.suthibu.cobblecraft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suthibu.cobblecraft.Cobble_Craft;
import net.suthibu.cobblecraft.item.ModItems;

import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Cobble_Craft.MOD_ID);

    public static final DeferredBlock<Block> RAINBOWCOBBLESTONE = registerBlock("rainbowcobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(100f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ONEMULTIPLIER_COBBLESTONE = registerBlock("onemultiplier_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TWOMULTIPLIER_COBBLESTONE = registerBlock("twomultiplier_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> THREEMULTIPLIER_COBBLESTONE = registerBlock("threemultiplier_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TESTGIF = registerBlock("testgif",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> THINKING_FACE = registerBlock("thinking_face",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ROTARE_THINKING_FACE = registerBlock("rotare_thinking_face",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> VERTICAL = registerBlock("vertical",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 100000f).requiresCorrectToolForDrops().sound(SoundType.STONE)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
