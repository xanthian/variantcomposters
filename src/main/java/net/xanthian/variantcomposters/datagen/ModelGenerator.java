package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;

import net.xanthian.variantcomposters.block.Composters;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        registerCustomComposter(blockStateModelGenerator, Composters.ACACIA_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.BAMBOO_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.BIRCH_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.CHERRY_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.CRIMSON_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.DARK_OAK_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.JUNGLE_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.MANGROVE_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.OAK_COMPOSTER);
        registerCustomComposter(blockStateModelGenerator, Composters.WARPED_COMPOSTER);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public final void registerCustomComposter(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block).with(BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getId(block))).with(When.create().set(Properties.LEVEL_8, 1), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents1"))).with(When.create().set(Properties.LEVEL_8, 2), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents2"))).with(When.create().set(Properties.LEVEL_8, 3), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents3"))).with(When.create().set(Properties.LEVEL_8, 4), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents4"))).with(When.create().set(Properties.LEVEL_8, 5), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents5"))).with(When.create().set(Properties.LEVEL_8, 6), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents6"))).with(When.create().set(Properties.LEVEL_8, 7), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents7"))).with(When.create().set(Properties.LEVEL_8, 8), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents_ready"))));
    }
}