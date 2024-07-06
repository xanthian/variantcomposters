package net.xanthian.variantcomposters.block.compatability;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;
import net.minecraft.block.ComposterBlock;

public class MineCells {

    public static Block MC_PUTRID_COMPOSTER;

    public static void registerComposters() {
        MC_PUTRID_COMPOSTER = registerComposter("mc_putrid_composter");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER)));
    }
}