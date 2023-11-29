package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;
import net.xanthian.variantcomposters.util.ModModel;

import java.util.Map;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void createComposter(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TextureMap textureMap = TextureMap.of(
                        TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.INSIDE, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"));
        ModModel.COMPOSTER.upload(block, textureMap, blockStateModelGenerator.modelCollector);
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

    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap) {
        for (Block composter : blockMap.values()) {
            createComposter(blockStateModelGenerator, composter);
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        registerModel(blockStateModelGenerator, Vanilla.VANILLA_COMPOSTERS);
        registerModel(blockStateModelGenerator, AdAstra.AA_COMPOSTERS);
        registerModel(blockStateModelGenerator, BeachParty.LDBP_COMPOSTERS);
        registerModel(blockStateModelGenerator, BetterArcheology.BA_COMPOSTERS);
        registerModel(blockStateModelGenerator, Bewitchment.BW_COMPOSTERS);
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_COMPOSTERS);
        registerModel(blockStateModelGenerator, Blockus.BLS_COMPOSTERS);
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_COMPOSTERS);
        registerModel(blockStateModelGenerator, EldritchEnd.EE_COMPOSTERS);
        registerModel(blockStateModelGenerator, MineCells.MC_COMPOSTERS);
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_COMPOSTERS);
        registerModel(blockStateModelGenerator, Promenade.PROM_COMPOSTERS);
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_COMPOSTERS);
        registerModel(blockStateModelGenerator, SnifferPlus.SP_COMPOSTERS);
        registerModel(blockStateModelGenerator, TechReborn.TR_COMPOSTERS);
        registerModel(blockStateModelGenerator, Vinery.LDV_COMPOSTERS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}