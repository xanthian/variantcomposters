package net.xanthian.variantcomposters.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.Initialise;

import java.util.Map;

public class Vanilla {

    public static Map<Identifier, Block> MOD_COMPOSTERS = Maps.newHashMap();

    public static final ComposterBlock ACACIA_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock BAMBOO_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock BIRCH_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock CHERRY_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock CRIMSON_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock DARK_OAK_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock JUNGLE_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock MANGROVE_COMPOSTER = new VariantComposterBlock();
    public static final ComposterBlock OAK_COMPOSTER = new VariantComposterBlock();
    // Vanilla Composter is made from Spruce
    public static final ComposterBlock WARPED_COMPOSTER = new VariantComposterBlock();

    public static void registerVanillaComposters() {
        registerComposterBlock("acacia_composter", ACACIA_COMPOSTER);
        registerComposterBlock("bamboo_composter", BAMBOO_COMPOSTER);
        registerComposterBlock("birch_composter", BIRCH_COMPOSTER);
        registerComposterBlock("cherry_composter", CHERRY_COMPOSTER);
        registerComposterBlock("crimson_composter", CRIMSON_COMPOSTER);
        registerComposterBlock("dark_oak_composter", DARK_OAK_COMPOSTER);
        registerComposterBlock("jungle_composter", JUNGLE_COMPOSTER);
        registerComposterBlock("mangrove_composter", MANGROVE_COMPOSTER);
        registerComposterBlock("oak_composter", OAK_COMPOSTER);
        registerComposterBlock("warped_composter", WARPED_COMPOSTER);
    }

    private static void registerComposterBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_COMPOSTERS.put(identifier, block);
    }
}
