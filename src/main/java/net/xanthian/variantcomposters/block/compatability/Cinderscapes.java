package net.xanthian.variantcomposters.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;

import java.util.Map;

public class Cinderscapes {
    public static Map<Identifier, Block> CS_COMPOSTERS = Maps.newHashMap();

    public static Block CS_SCORCHED_COMPOSTER;
    public static Block CS_UMBRAL_COMPOSTER;

    public static void registerComposters() {
        CS_SCORCHED_COMPOSTER = registerComposter("cs_scorched_composter");
        CS_UMBRAL_COMPOSTER = registerComposter("cs_umbral_composter");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        CS_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER)));
    }
}