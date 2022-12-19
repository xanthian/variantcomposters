package net.xanthian.variantcomposters.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class VariantComposterBlock extends ComposterBlock {
    public static final TagKey<Block> FARMER_WORKSTATION = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c", "workstation/farmer"));
    public VariantComposterBlock() {
        super(FabricBlockSettings.copy(Blocks.COMPOSTER));
    }
}