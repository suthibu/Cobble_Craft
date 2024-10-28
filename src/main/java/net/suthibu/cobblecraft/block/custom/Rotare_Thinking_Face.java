package net.suthibu.cobblecraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class Rotare_Thinking_Face extends Block {
    public static final BooleanProperty REDSTONE = BooleanProperty.create("redstone");

    public Rotare_Thinking_Face(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(REDSTONE, false ));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()){
            boolean currentState = state.getValue(REDSTONE);
            level.setBlockAndUpdate(pos,state.setValue(REDSTONE,!currentState));
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(REDSTONE);
    }
}
