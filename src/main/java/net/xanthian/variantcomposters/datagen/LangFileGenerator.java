package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantcomposters.Initialise;
import net.xanthian.variantcomposters.block.Composters;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {

            translationBuilder.add(Initialise.ITEM_GROUP, "Variant Composters");

            translationBuilder.add(Composters.ACACIA_COMPOSTER, "Acacia Composter");
            translationBuilder.add(Composters.BAMBOO_COMPOSTER, "Bamboo Composter");
            translationBuilder.add(Composters.BIRCH_COMPOSTER, "Birch Composter");
            translationBuilder.add(Composters.CHERRY_COMPOSTER, "Cherry Composter");
            translationBuilder.add(Composters.CRIMSON_COMPOSTER, "Crimson Composter");
            translationBuilder.add(Composters.DARK_OAK_COMPOSTER, "Dark Oak Composter");
            translationBuilder.add(Composters.JUNGLE_COMPOSTER, "Jungle Composter");
            translationBuilder.add(Composters.MANGROVE_COMPOSTER, "Mangrove Composter");
            translationBuilder.add(Composters.OAK_COMPOSTER, "Oak Composter");
            translationBuilder.add(Blocks.COMPOSTER, "Spruce Composter");
            translationBuilder.add(Composters.WARPED_COMPOSTER, "Warped Composter");
        }
}
