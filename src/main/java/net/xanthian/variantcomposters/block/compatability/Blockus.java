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

public class Blockus {

    public static Map<Identifier, Block> BLS_COMPOSTERS = Maps.newHashMap();

    public static Block BLS_CHARRED_COMPOSTER;
    public static Block BLS_RAW_BAMBOO_COMPOSTER;
    public static Block BLS_WHITE_OAK_COMPOSTER;

    public static void registerComposters() {

        BLS_CHARRED_COMPOSTER = registerComposter("bls_charred_composter");
        BLS_RAW_BAMBOO_COMPOSTER = registerComposter("bls_raw_bamboo_composter");
        BLS_WHITE_OAK_COMPOSTER = registerComposter("bls_white_oak_composter");

    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BLS_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}