package net.mystery2099.glass_pane_connectables_mod.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.mystery2099.glass_pane_connectables_mod.GlassPaneConnectablesMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PaneBlock.class)
public class PaneBlockMixin {
    @Inject(method = "connectsTo", at = @At("HEAD"), cancellable = true)
    private void connectsTo(BlockState state, boolean sideSolidFullSquare, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(GlassPaneConnectablesMod.GLASS_PANE_CONNECTABLES_TAG_KEY)) cir.setReturnValue(true);
    }
}
