package net.xanthian.variantcomposters.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.variantcomposters.Initialise;

import java.util.Map;

public class Composters {

    public static Map<Identifier, Block> MOD_COMPOSTERS = Maps.newHashMap();

    public static void addVanillaComposters() {
        VariantComposterBlock ACACIA_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("acacia_composter", ACACIA_COMPOSTER, true);
        VariantComposterBlock BIRCH_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("birch_composter", BIRCH_COMPOSTER, true);
        VariantComposterBlock DARK_OAK_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("dark_oak_composter", DARK_OAK_COMPOSTER, true);
        VariantComposterBlock JUNGLE_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("jungle_composter", JUNGLE_COMPOSTER, true);
        VariantComposterBlock OAK_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("oak_composter", OAK_COMPOSTER, true);
    }
    public static void addVanilla119Composter() {
        VariantComposterBlock MANGROVE_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("mangrove_composter", MANGROVE_COMPOSTER, true);
    }
    public static void addNetherComposters() {
        VariantComposterBlock CRIMSON_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("crimson_composter", CRIMSON_COMPOSTER, false);
        VariantComposterBlock WARPED_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("warped_composter", WARPED_COMPOSTER, false);
    }
    public static void addTechRebornComposters() {
        VariantComposterBlock RUBBER_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("rubber_composter", RUBBER_COMPOSTER, true);
    }
    public static void addEpicPaladinsComposters() {
        VariantComposterBlock JADE_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("jade_composter", JADE_COMPOSTER, true);
        VariantComposterBlock MOON_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("moon_composter", MOON_COMPOSTER, true);
        VariantComposterBlock SHADOW_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("shadow_composter", SHADOW_COMPOSTER, true);
    }
    public static void addSimpleMangoComposters() {
        VariantComposterBlock MANGO_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("mango_composter", MANGO_COMPOSTER, true);
    }
    public static void addTraverseComposters() {
        VariantComposterBlock FIR_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("fir_composter", FIR_COMPOSTER, true);
    }
    public static void addTerrestriaComposters() {
        VariantComposterBlock CYPRESS_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("cypress_composter", CYPRESS_COMPOSTER, true);
        VariantComposterBlock HEMLOCK_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("hemlock_composter", HEMLOCK_COMPOSTER, true);
        VariantComposterBlock JAPANESE_MAPLE_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("japanese_maple_composter", JAPANESE_MAPLE_COMPOSTER, true);
        VariantComposterBlock RAINBOW_EUCALYPTUS_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("rainbow_eucalyptus_composter", RAINBOW_EUCALYPTUS_COMPOSTER, true);
        VariantComposterBlock REDWOOD_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("redwood_composter", REDWOOD_COMPOSTER, true);
        VariantComposterBlock RUBBER_COMPOSTER2 = new VariantComposterBlock();
        registerComposterBlock("rubber_composter2", RUBBER_COMPOSTER2, true);
        VariantComposterBlock SAKURA_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("sakura_composter", SAKURA_COMPOSTER, true);
        VariantComposterBlock WILLOW_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("willow_composter", WILLOW_COMPOSTER, true);
        VariantComposterBlock YUCCA_PALM_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("yucca_palm_composter", YUCCA_PALM_COMPOSTER, true);
    }
    public static void addCinderscapesComposters() {
        VariantComposterBlock SCORCHED_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("scorched_composter", SCORCHED_COMPOSTER, true);
        VariantComposterBlock UMBRAL_COMPOSTER = new VariantComposterBlock();
        registerComposterBlock("umbral_composter", UMBRAL_COMPOSTER, true);
    }


    // To-do : Updated Blockus, Promenade, Bewitchment, Biome Makeover, Ecologics, Enriched, Twigs, Croptopia, Wilder World
    // Not yet updated : Botania, Spectrum, Paradise Lost

    private static void registerComposterBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_COMPOSTERS)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
        MOD_COMPOSTERS.put(identifier, block);
    }
}