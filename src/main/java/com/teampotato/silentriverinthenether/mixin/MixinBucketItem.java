package com.teampotato.silentriverinthenether.mixin;

import com.teampotato.silentriverinthenether.SilentRiverInTheNether;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.tags.ITag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BucketItem.class)
public abstract class MixinBucketItem {
    @Redirect(method = "emptyBucket", at = @At(value = "INVOKE", target = "Lnet/minecraft/fluid/Fluid;is(Lnet/minecraft/tags/ITag;)Z"))
    private boolean onCheck(Fluid content, ITag<Fluid> pTag) {
        if (content.is(SilentRiverInTheNether.SILENT_RIVERS)) {
            return false;
        } else {
            return content.is(pTag);
        }
    }
}
