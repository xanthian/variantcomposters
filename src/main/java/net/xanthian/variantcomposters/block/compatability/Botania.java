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

public class Botania {

    public static Map<Identifier, Block> BOT_COMPOSTERS = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_COMPOSTER;
    public static Block BOT_LIVINGWOOD_COMPOSTER;
    public static Block BOT_SHIMMERWOOD_COMPOSTER;

    public static void registerComposters() {
        BOT_DREAMWOOD_COMPOSTER = registerComposter("bot_dreamwood_composter");
        BOT_LIVINGWOOD_COMPOSTER = registerComposter("bot_livingwood_composter");
        BOT_SHIMMERWOOD_COMPOSTER = registerComposter("bot_shimmerwood_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER)));
    }
}