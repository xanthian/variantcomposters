package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;
import net.xanthian.variantcomposters.util.ModModel;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block block : Vanilla.MOD_COMPOSTERS.values()){
            createComposter(blockStateModelGenerator, block);
        }

        // Ad Astra
        for (Block block : AdAstra.AA_COMPOSTERS.values()) {
            createComposter(blockStateModelGenerator, block);
        }

        // Beach Party (Lets Do)
        createComposter(blockStateModelGenerator, BeachParty.LDBP_PALM_COMPOSTER);

        // Better Archeology
        createComposter(blockStateModelGenerator, BetterArcheology.BA_ROTTEN_COMPOSTER);

        // Bewitchment
        for (Block block : Bewitchment.BW_COMPOSTERS.values()){
            createComposter(blockStateModelGenerator, block);
        }

        // Deeper & Darker
        createComposter(blockStateModelGenerator, DeeperAndDarker.DAD_ECHO_COMPOSTER);

        // MineCells
        createComposter(blockStateModelGenerator, MineCells.MC_PUTRID_COMPOSTER);

        // Natures Spirit
        for (Block block : NaturesSpirit.NS_COMPOSTERS.values()){
            createComposter(blockStateModelGenerator, block);
        }

        // Promenade
        for (Block block : Promenade.PROM_COMPOSTERS.values()){
            createComposter(blockStateModelGenerator, block);
        }

        // Regions Unexplored
        for (Block block : RegionsUnexplored.RU_COMPOSTERS.values()){
            createComposter(blockStateModelGenerator, block);
        }
        
        // SnifferPlus
        createComposter(blockStateModelGenerator, SnifferPlus.SP_STONE_PINE_COMPOSTER);
        
        // Tech Reborn
        createComposter(blockStateModelGenerator, TechReborn.TR_RUBBER_COMPOSTER);
        
        // Vinery (Lets Do)
        createComposter(blockStateModelGenerator, Vinery.LDV_CHERRY_COMPOSTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    public final void createComposter(BlockStateModelGenerator blockStateModelGenerator, Block block) {
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
}