package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

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

        // Ad Astra
        translationBuilder.add(AdAstra.AA_AERONOS_COMPOSTER, "Aeronos Composter");
        translationBuilder.add(AdAstra.AA_GLACIAN_COMPOSTER, "Glacian Composter");
        translationBuilder.add(AdAstra.AA_STROPHAR_COMPOSTER, "Strophar Composter");

        // Beach Party (Lets Do)
        translationBuilder.add(BeachParty.LDBP_PALM_COMPOSTER, "Palm Composter");

        // Better Archeology
        translationBuilder.add(BetterArcheology.BA_ROTTEN_COMPOSTER, "Rotten Composter");

        // Bewitchment
        translationBuilder.add(Bewitchment.BW_CYPRESS_COMPOSTER, "Cypress Composter");
        translationBuilder.add(Bewitchment.BW_DRAGONS_BLOOD_COMPOSTER, "Dragon's Blood Composter");
        translationBuilder.add(Bewitchment.BW_ELDER_COMPOSTER, "Elder Composter");
        translationBuilder.add(Bewitchment.BW_JUNIPER_COMPOSTER, "Juniper Composter");

        // Deeper & Darker
        translationBuilder.add(DeeperAndDarker.DAD_ECHO_COMPOSTER, "Echo Composter");

        // MineCells
        translationBuilder.add(MineCells.MC_PUTRID_COMPOSTER, "Putrid Composter");

        // Natures Spirit
        translationBuilder.add(NaturesSpirit.NS_ASPEN_COMPOSTER, "Aspen Composter");
        translationBuilder.add(NaturesSpirit.NS_CYPRESS_COMPOSTER,"Cypress Composter");
        translationBuilder.add(NaturesSpirit.NS_FIR_COMPOSTER,"Fir Composter");
        translationBuilder.add(NaturesSpirit.NS_JOSHUA_COMPOSTER,"Joshua Composter");
        translationBuilder.add(NaturesSpirit.NS_MAPLE_COMPOSTER, "Maple Composter");
        translationBuilder.add(NaturesSpirit.NS_OLIVE_COMPOSTER, "Olive Composter");
        translationBuilder.add(NaturesSpirit.NS_REDWOOD_COMPOSTER, "Redwood Composter");
        translationBuilder.add(NaturesSpirit.NS_SUGI_COMPOSTER, "Sugi Composter");
        translationBuilder.add(NaturesSpirit.NS_WILLOW_COMPOSTER, "Willow Composter");
        translationBuilder.add(NaturesSpirit.NS_WISTERIA_COMPOSTER, "Wisteria Composter");

        // Promenade
        translationBuilder.add(Promenade.PROM_DARK_AMARANTH_COMPOSTER, "Dark Amaranth Composter");
        translationBuilder.add(Promenade.PROM_MAPLE_COMPOSTER, "Maple Composter");
        translationBuilder.add(Promenade.PROM_PALM_COMPOSTER, "Palm Composter");
        translationBuilder.add(Promenade.PROM_SAKURA_COMPOSTER, "Sakura Composter");

        // Regions Unexplored
        translationBuilder.add(RegionsUnexplored.RU_ALPHA_OAK_COMPOSTER, "Alpha Oak Composter");
        translationBuilder.add(RegionsUnexplored.RU_BAOBAB_COMPOSTER,"Baobab Composter");
        translationBuilder.add(RegionsUnexplored.RU_BLACK_PAINTED_COMPOSTER,"Black Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_BLACKWOOD_COMPOSTER,"Blackwood Composter");
        translationBuilder.add(RegionsUnexplored.RU_BLUE_PAINTED_COMPOSTER, "Blue Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_BROWN_PAINTED_COMPOSTER, "Brown Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_CYAN_PAINTED_COMPOSTER, "Cyan Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_CYPRESS_COMPOSTER, "Cypress Composter");
        translationBuilder.add(RegionsUnexplored.RU_DEAD_COMPOSTER, "Dead Composter");
        translationBuilder.add(RegionsUnexplored.RU_EUCALYPTUS_COMPOSTER, "Eucalyptus Composter");
        translationBuilder.add(RegionsUnexplored.RU_GRAY_PAINTED_COMPOSTER, "Gray Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_GREEN_PAINTED_COMPOSTER, "Green Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_JOSHUA_COMPOSTER, "Joshua Composter");
        translationBuilder.add(RegionsUnexplored.RU_LARCH_COMPOSTER, "Larch Composter");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_COMPOSTER, "Light Blue Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_COMPOSTER, "Light Gray Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_LIME_PAINTED_COMPOSTER, "Lime Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_MAGENTA_PAINTED_COMPOSTER, "Magenta Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_MAPLE_COMPOSTER, "Maple Composter");
        translationBuilder.add(RegionsUnexplored.RU_MAUVE_COMPOSTER, "Mauve Composter");
        translationBuilder.add(RegionsUnexplored.RU_ORANGE_PAINTED_COMPOSTER, "Orange Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_PALM_COMPOSTER, "Palm Composter");
        translationBuilder.add(RegionsUnexplored.RU_PINE_COMPOSTER, "Pine Composter");
        translationBuilder.add(RegionsUnexplored.RU_PINK_PAINTED_COMPOSTER, "Pink Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_PURPLE_PAINTED_COMPOSTER, "Purple Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_REDWOOD_COMPOSTER, "Redwood Composter");
        translationBuilder.add(RegionsUnexplored.RU_RED_PAINTED_COMPOSTER, "Red Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_WHITE_PAINTED_COMPOSTER, "White Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_WILLOW_COMPOSTER, "Willow Composter");
        translationBuilder.add(RegionsUnexplored.RU_YELLOW_PAINTED_COMPOSTER, "Yellow Painted Composter");
        translationBuilder.add(RegionsUnexplored.RU_CHERRY_COMPOSTER, "Cherry Composter");
        translationBuilder.add(RegionsUnexplored.RU_SCULKWOOD_COMPOSTER, "Sculkwood Composter");
        translationBuilder.add(RegionsUnexplored.RU_BRIMWOOD_COMPOSTER, "Brimwood Composter");
        translationBuilder.add(RegionsUnexplored.RU_COBALT_COMPOSTER, "Cobalt Composter");
        translationBuilder.add(RegionsUnexplored.RU_KAPOK_COMPOSTER, "Kapok Composter");
        translationBuilder.add(RegionsUnexplored.RU_MAGNOLIA_COMPOSTER, "Magnolia Composter");
        translationBuilder.add(RegionsUnexplored.RU_SOCOTRA_COMPOSTER, "Socotra Composter");
        translationBuilder.add(RegionsUnexplored.RU_YELLOW_BIOSHROOM_COMPOSTER, "Yellow Bioshroom Composter");

        // SnifferPlus
        translationBuilder.add(SnifferPlus.SP_STONE_PINE_COMPOSTER, "Stone Pine Composter");

        // Tech Reborn
        translationBuilder.add(TechReborn.TR_RUBBER_COMPOSTER, "Rubber Composter");

        // Vinery
        translationBuilder.add(Vinery.LDV_CHERRY_COMPOSTER,"Cherry Composter");
    }
}