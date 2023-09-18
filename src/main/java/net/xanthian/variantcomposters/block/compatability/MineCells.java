package net.xanthian.variantcomposters.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;
import net.xanthian.variantcomposters.block.VariantComposterBlock;

public class MineCells {

    public static Block MC_PUTRID_COMPOSTER;

    public static void registerComposters() {
        MC_PUTRID_COMPOSTER = registerComposter("mc_putrid_composter");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}