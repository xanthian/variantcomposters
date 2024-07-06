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

public class DeeperAndDarker {
    public static Block DAD_ECHO_COMPOSTER;

    public static void registerComposters() {
        DAD_ECHO_COMPOSTER = registerComposter("dad_echo_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER)));
    }
}