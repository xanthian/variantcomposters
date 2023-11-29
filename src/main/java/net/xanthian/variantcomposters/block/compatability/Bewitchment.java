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

public class Bewitchment {

    public static Map<Identifier, Block> BW_COMPOSTERS = Maps.newHashMap();

    public static Block BW_CYPRESS_COMPOSTER;
    public static Block BW_DRAGONS_BLOOD_COMPOSTER;
    public static Block BW_ELDER_COMPOSTER;
    public static Block BW_JUNIPER_COMPOSTER;

    public static void registerComposters() {
        BW_CYPRESS_COMPOSTER = registerComposter("bw_cypress_composter");
        BW_DRAGONS_BLOOD_COMPOSTER = registerComposter("bw_dragons_blood_composter");
        BW_ELDER_COMPOSTER = registerComposter("bw_elder_composter");
        BW_JUNIPER_COMPOSTER = registerComposter("bw_juniper_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BW_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}