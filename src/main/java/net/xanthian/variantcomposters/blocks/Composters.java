package net.xanthian.variantcomposters.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.variantcomposters.Init;

public class Composters {


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

    private static void registerComposterBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.VARIANT_COMPOSTERS)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}