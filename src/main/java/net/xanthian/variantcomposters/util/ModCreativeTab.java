package net.xanthian.variantcomposters.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

import static net.xanthian.variantcomposters.Initialise.isModVersion;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Initialise.MOD_ID, "variantcomposters"),

            FabricItemGroup.builder()
                    .displayName(Text.literal("Variant Composters"))
                    .icon(() -> new ItemStack(Vanilla.MANGROVE_COMPOSTER))
                    .entries((context, entries) -> {

                        entries.add(Vanilla.ACACIA_COMPOSTER);
                        entries.add(Vanilla.BAMBOO_COMPOSTER);
                        entries.add(Vanilla.BIRCH_COMPOSTER);
                        entries.add(Vanilla.CHERRY_COMPOSTER);
                        entries.add(Vanilla.CRIMSON_COMPOSTER);
                        entries.add(Vanilla.DARK_OAK_COMPOSTER);
                        entries.add(Vanilla.JUNGLE_COMPOSTER);
                        entries.add(Vanilla.MANGROVE_COMPOSTER);
                        entries.add(Vanilla.OAK_COMPOSTER);
                        entries.add(Blocks.COMPOSTER); // Spruce
                        entries.add(Vanilla.WARPED_COMPOSTER);

                        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                            for (Block block : AdAstra.AA_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
                            entries.add(BeachParty.LDBP_PALM_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                            entries.add(BetterArcheology.BA_ROTTEN_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
                            for (Block block : Bewitchment.BW_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
                            entries.add(EldritchEnd.EE_PRIMORDIAL_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("minecells")) {
                            entries.add(MineCells.MC_PUTRID_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("promenade")) {
                            for (Block block : Promenade.PROM_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
                            entries.add(RegionsUnexplored.RU_ALPHA_OAK_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_BAOBAB_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_BLACK_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_BLACKWOOD_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_BLUE_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_BROWN_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_CYAN_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_CYPRESS_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_DEAD_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_EUCALYPTUS_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_GRAY_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_GREEN_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_JOSHUA_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_LARCH_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_LIME_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_MAGENTA_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_MAPLE_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_MAUVE_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_ORANGE_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_PALM_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_PINE_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_PINK_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_PURPLE_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_REDWOOD_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_RED_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_WHITE_PAINTED_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_WILLOW_COMPOSTER);
                            entries.add(RegionsUnexplored.RU_YELLOW_PAINTED_COMPOSTER);
                            if (isModVersion("regions_unexplored", "0.4")) {
                                entries.add(RegionsUnexplored.RU_CHERRY_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_SCULKWOOD_COMPOSTER);
                            } else {
                                entries.add(RegionsUnexplored.RU_BRIMWOOD_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_COBALT_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_KAPOK_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_MAGNOLIA_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_SOCOTRA_COMPOSTER);
                                entries.add(RegionsUnexplored.RU_YELLOW_BIOSHROOM_COMPOSTER);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
                            entries.add(SnifferPlus.SP_STONE_PINE_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("vinery")) {
                            entries.add(Vinery.LDV_CHERRY_COMPOSTER);
                        }
                    })
                    .build());

    public static void registerItemGroup() {
    }
}