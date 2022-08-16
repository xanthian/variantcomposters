package net.xanthian.variantcomposters.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VariantComposterBlock extends ComposterBlock {
    public static final TagKey<Block> FARMER_WORKSTATION = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "workstation/farmer"));
    public VariantComposterBlock() {
        super(FabricBlockSettings.copy(Blocks.COMPOSTER));
    }
}