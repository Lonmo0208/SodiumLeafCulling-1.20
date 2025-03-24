package toni.sodiumleafculling.mixins;


import me.jellysquid.mods.sodium.client.render.frapi.render.AbstractBlockRenderContext;
import me.jellysquid.mods.sodium.client.world.LevelSlice;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = AbstractBlockRenderContext.class, remap = false, priority = 100)
public interface AbstractBlockRenderContextAccessor {
    @Accessor
    BlockState getState();

    @Accessor
    LevelSlice getSlice();

    @Accessor
    BlockPos getPos();
}

