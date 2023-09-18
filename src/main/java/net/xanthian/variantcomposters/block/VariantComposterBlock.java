package net.xanthian.variantcomposters.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;

public class VariantComposterBlock extends ComposterBlock {
    public VariantComposterBlock() {
        super(FabricBlockSettings.copy(Blocks.COMPOSTER));
    }
}
