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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_COMPOSTERS = Maps.newHashMap();

    public static Block NS_ASPEN_COMPOSTER;
    public static Block NS_CYPRESS_COMPOSTER;
    public static Block NS_FIR_COMPOSTER;
    public static Block NS_JOSHUA_COMPOSTER;
    public static Block NS_MAPLE_COMPOSTER;
    public static Block NS_OLIVE_COMPOSTER;
    public static Block NS_REDWOOD_COMPOSTER;
    public static Block NS_SUGI_COMPOSTER;
    public static Block NS_WILLOW_COMPOSTER;
    public static Block NS_WISTERIA_COMPOSTER;

    public static void registerComposters() {
        NS_ASPEN_COMPOSTER = registerComposter("ns_aspen_composter");
        NS_CYPRESS_COMPOSTER = registerComposter("ns_cypress_composter");
        NS_FIR_COMPOSTER = registerComposter("ns_fir_composter");
        NS_JOSHUA_COMPOSTER = registerComposter("ns_joshua_composter");
        NS_MAPLE_COMPOSTER = registerComposter("ns_maple_composter");
        NS_OLIVE_COMPOSTER = registerComposter("ns_olive_composter");
        NS_REDWOOD_COMPOSTER = registerComposter("ns_redwood_composter");
        NS_SUGI_COMPOSTER = registerComposter("ns_sugi_composter");
        NS_WILLOW_COMPOSTER = registerComposter("ns_willow_composter");
        NS_WISTERIA_COMPOSTER = registerComposter("ns_wisteria_composter");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        NS_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}