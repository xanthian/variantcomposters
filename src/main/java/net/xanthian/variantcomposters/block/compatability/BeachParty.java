package net.xanthian.variantcomposters.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;
import net.xanthian.variantcomposters.block.VariantComposterBlock;

import java.util.Map;

public class BeachParty {

    public static Map<Identifier, Block> LDBP_COMPOSTERS = Maps.newHashMap();

    public static Block LDBP_PALM_COMPOSTER;

    public static void registerComposters() {
        LDBP_PALM_COMPOSTER = registerComposter("ldbp_palm_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        LDBP_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}