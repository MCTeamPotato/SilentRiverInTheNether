package com.teampotato.silentriverinthenether;

import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.common.Mod;

@Mod(SilentRiverInTheNether.ID)
public class SilentRiverInTheNether {
    public static final String ID = "silentriverinthenether";

    public static final Tags.IOptionalNamedTag<Fluid> SILENT_RIVERS = FluidTags.createOptional(new ResourceLocation(ID, "silent_rivers"));
}
