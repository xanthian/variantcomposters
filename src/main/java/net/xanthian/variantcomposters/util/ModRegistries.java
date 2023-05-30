package net.xanthian.variantcomposters.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.FireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.xanthian.variantcomposters.block.Composters;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

/**
 Copy from {@link FireBlock#registerDefaultFlammables()}
 **/

        registry.add(Composters.ACACIA_COMPOSTER, 5, 20);
        registry.add(Composters.BAMBOO_COMPOSTER, 5, 20);
        registry.add(Composters.BIRCH_COMPOSTER, 5, 20);
        registry.add(Composters.CHERRY_COMPOSTER, 5, 20);
        registry.add(Composters.DARK_OAK_COMPOSTER, 5, 20);
        registry.add(Composters.JUNGLE_COMPOSTER, 5, 20);
        registry.add(Composters.MANGROVE_COMPOSTER, 5, 20);
        registry.add(Composters.OAK_COMPOSTER, 5, 20);

    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(Composters.ACACIA_COMPOSTER, 300);
        registry.add(Composters.BAMBOO_COMPOSTER, 300);
        registry.add(Composters.BIRCH_COMPOSTER, 300);
        registry.add(Composters.CHERRY_COMPOSTER, 300);
        registry.add(Composters.DARK_OAK_COMPOSTER, 300);
        registry.add(Composters.JUNGLE_COMPOSTER, 300);
        registry.add(Composters.MANGROVE_COMPOSTER, 300);
        registry.add(Composters.OAK_COMPOSTER, 300);

    }
}