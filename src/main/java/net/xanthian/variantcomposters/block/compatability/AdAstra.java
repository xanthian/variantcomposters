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

public class AdAstra {

    public static Map<Identifier, Block> AA_COMPOSTERS = Maps.newHashMap();

    public static Block AA_AERONOS_COMPOSTER;
    public static Block AA_GLACIAN_COMPOSTER;
    public static Block AA_STROPHAR_COMPOSTER;

    public static void registerComposters() {
        AA_AERONOS_COMPOSTER = registerComposter("aa_aeronos_composter");
        AA_GLACIAN_COMPOSTER = registerComposter("aa_glacian_composter");
        AA_STROPHAR_COMPOSTER = registerComposter("aa_strophar_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        AA_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}