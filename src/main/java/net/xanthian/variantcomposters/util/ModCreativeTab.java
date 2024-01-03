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
                        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
                            for (Block block : BiomeMakeover.BM_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("botania")) {
                            for (Block block : Botania.BOT_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_COMPOSTERS.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_COMPOSTER);
                        }
                        if (FabricLoader.getInstance().isModLoaded("desolation")) {
                            entries.add(Desolation.DS_CHARRED_COMPOSTER);
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
                            for (Block block : RegionsUnexplored.RU_COMPOSTERS.values()) {
                                entries.add(block);
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
                    .texture("variantcomposters.png").noRenderedName().build());

    public static void registerItemGroup() {
    }
}