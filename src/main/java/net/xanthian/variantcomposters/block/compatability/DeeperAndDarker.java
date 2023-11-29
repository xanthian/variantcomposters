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

public class DeeperAndDarker {

    public static Map<Identifier, Block> DAD_COMPOSTERS = Maps.newHashMap();

    public static Block DAD_ECHO_COMPOSTER;

    public static void registerComposters() {
        DAD_ECHO_COMPOSTER = registerComposter("dad_echo_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        DAD_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}