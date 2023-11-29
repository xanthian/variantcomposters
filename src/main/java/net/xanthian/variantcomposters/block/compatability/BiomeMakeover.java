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

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_COMPOSTERS = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_COMPOSTER;
    public static Block BM_BLIGHTED_BALSA_COMPOSTER;
    public static Block BM_SWAMP_CYPRESS_COMPOSTER;
    public static Block BM_WILLOW_COMPOSTER;

    public static void registerComposters() {
        BM_ANCIENT_OAK_COMPOSTER = registerComposter("bm_ancient_oak_composter");
        BM_BLIGHTED_BALSA_COMPOSTER = registerComposter("bm_blighted_balsa_composter");
        BM_SWAMP_CYPRESS_COMPOSTER = registerComposter("bm_swamp_cypress_composter");
        BM_WILLOW_COMPOSTER = registerComposter("bm_willow_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}