package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_COMPOSTER, "Acacia Composter");
        translationBuilder.add(Vanilla.BAMBOO_COMPOSTER, "Bamboo Composter");
        translationBuilder.add(Vanilla.BIRCH_COMPOSTER, "Birch Composter");
        translationBuilder.add(Vanilla.CHERRY_COMPOSTER, "Cherry Composter");
        translationBuilder.add(Vanilla.CRIMSON_COMPOSTER, "Crimson Composter");
        translationBuilder.add(Vanilla.DARK_OAK_COMPOSTER, "Dark Oak Composter");
        translationBuilder.add(Vanilla.JUNGLE_COMPOSTER, "Jungle Composter");
        translationBuilder.add(Vanilla.MANGROVE_COMPOSTER, "Mangrove Composter");
        translationBuilder.add(Vanilla.OAK_COMPOSTER, "Oak Composter");
        translationBuilder.add(Blocks.COMPOSTER, "Spruce Composter");
        translationBuilder.add(Vanilla.WARPED_COMPOSTER, "Warped Composter");

        registerTranslations(translationBuilder, AdAstra.AA_COMPOSTERS);
        registerTranslations(translationBuilder, BeachParty.LDBP_COMPOSTERS);
        registerTranslations(translationBuilder, BetterArcheology.BA_COMPOSTERS);
        registerTranslations(translationBuilder, Bewitchment.BW_COMPOSTERS);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_COMPOSTERS);
        registerTranslations(translationBuilder, EldritchEnd.EE_COMPOSTERS);
        registerTranslations(translationBuilder, MineCells.MC_COMPOSTERS);
        registerTranslations(translationBuilder, NaturesSpirit.NS_COMPOSTERS);
        registerTranslations(translationBuilder, Promenade.PROM_COMPOSTERS);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_COMPOSTERS);
        registerTranslations(translationBuilder, SnifferPlus.SP_COMPOSTERS);
        registerTranslations(translationBuilder, TechReborn.TR_COMPOSTERS);
        registerTranslations(translationBuilder, Vinery.LDV_COMPOSTERS);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }
}