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

public class Promenade {

    public static Map<Identifier, Block> PROM_COMPOSTERS = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_COMPOSTER;
    public static Block PROM_MAPLE_COMPOSTER;
    public static Block PROM_PALM_COMPOSTER;
    public static Block PROM_SAKURA_COMPOSTER;

    public static void registerComposters() {
        PROM_DARK_AMARANTH_COMPOSTER = registerComposter("prom_dark_amaranth_composter");
        PROM_MAPLE_COMPOSTER = registerComposter("prom_maple_composter");
        PROM_PALM_COMPOSTER = registerComposter("prom_palm_composter");
        PROM_SAKURA_COMPOSTER = registerComposter("prom_sakura_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}