package net.xanthian.variantcomposters.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Vanilla.ACACIA_COMPOSTER, 30, 20);
        registry.add(Vanilla.BAMBOO_COMPOSTER, 30, 20);
        registry.add(Vanilla.BIRCH_COMPOSTER, 30, 20);
        registry.add(Vanilla.CHERRY_COMPOSTER, 30, 20);
        registry.add(Vanilla.DARK_OAK_COMPOSTER, 30, 20);
        registry.add(Vanilla.JUNGLE_COMPOSTER, 30, 20);
        registry.add(Vanilla.MANGROVE_COMPOSTER, 30, 20);
        registry.add(Vanilla.OAK_COMPOSTER, 30, 20);


        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_COMPOSTERS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_COMPOSTERS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_COMPOSTERS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_COMPOSTER, 30, 20);
            registry.add(Blockus.BLS_WHITE_OAK_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_COMPOSTERS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_COMPOSTER, 30, 20);
            registry.add(Promenade.PROM_PALM_COMPOSTER, 30, 20);
            registry.add(Promenade.PROM_SAKURA_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_BAOBAB_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_CYPRESS_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_JOSHUA_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_LARCH_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_MAPLE_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_MAUVE_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_PALM_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_PINE_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_REDWOOD_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_WILLOW_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_COMPOSTER, 30, 20);

            registry.add(RegionsUnexplored.RU_CHERRY_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_SCULKWOOD_COMPOSTER, 30, 20);

            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_KAPOK_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_COMPOSTER, 30, 20);
            registry.add(RegionsUnexplored.RU_SOCOTRA_COMPOSTER, 30, 20);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_COMPOSTER, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_COMPOSTER, 30, 20);
        }
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_COMPOSTER, 300);
        registry.add(Vanilla.BAMBOO_COMPOSTER, 300);
        registry.add(Vanilla.BIRCH_COMPOSTER, 300);
        registry.add(Vanilla.CHERRY_COMPOSTER, 300);
        registry.add(Vanilla.DARK_OAK_COMPOSTER, 300);
        registry.add(Vanilla.JUNGLE_COMPOSTER, 300);
        registry.add(Vanilla.MANGROVE_COMPOSTER, 300);
        registry.add(Vanilla.OAK_COMPOSTER, 300);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_COMPOSTER, 300);
            registry.add(Blockus.BLS_WHITE_OAK_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_COMPOSTER, 300);
            registry.add(Promenade.PROM_PALM_COMPOSTER, 300);
            registry.add(Promenade.PROM_SAKURA_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_LARCH_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_PALM_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_PINE_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_COMPOSTER, 300);

            registry.add(RegionsUnexplored.RU_CHERRY_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_SCULKWOOD_COMPOSTER, 300);

            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_KAPOK_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_COMPOSTER, 300);
            registry.add(RegionsUnexplored.RU_SOCOTRA_COMPOSTER, 300);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_COMPOSTER, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_COMPOSTER, 300);
        }
    }
}