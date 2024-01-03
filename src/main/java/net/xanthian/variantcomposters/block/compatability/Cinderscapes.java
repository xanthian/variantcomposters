package net.xanthian.variantcomposters.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
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

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        CS_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER)));
    }
}