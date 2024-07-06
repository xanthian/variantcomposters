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

        registry.add(Vanilla.ACACIA_COMPOSTER, 5, 20);
        registry.add(Vanilla.BAMBOO_COMPOSTER, 5, 20);
        registry.add(Vanilla.BIRCH_COMPOSTER, 5, 20);
        registry.add(Vanilla.CHERRY_COMPOSTER, 5, 20);
        registry.add(Vanilla.DARK_OAK_COMPOSTER, 5, 20);
        registry.add(Vanilla.JUNGLE_COMPOSTER, 5, 20);
        registry.add(Vanilla.MANGROVE_COMPOSTER, 5, 20);
        registry.add(Vanilla.OAK_COMPOSTER, 5, 20);

        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_COMPOSTERS.values()) {
                registry.add(block, 5, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_COMPOSTERS.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_COMPOSTER, 30, 20);
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

        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_COMPOSTERS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_COMPOSTER, 300);
        }
    }
}