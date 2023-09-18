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

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_COMPOSTERS = Maps.newHashMap();

    public static Block RU_ALPHA_OAK_COMPOSTER;
    public static Block RU_BAOBAB_COMPOSTER;
    public static Block RU_BLACK_PAINTED_COMPOSTER;
    public static Block RU_BLACKWOOD_COMPOSTER;
    public static Block RU_BLUE_PAINTED_COMPOSTER;
    public static Block RU_BROWN_PAINTED_COMPOSTER;
    public static Block RU_CYAN_PAINTED_COMPOSTER;
    public static Block RU_CYPRESS_COMPOSTER;
    public static Block RU_DEAD_COMPOSTER;
    public static Block RU_EUCALYPTUS_COMPOSTER;
    public static Block RU_GRAY_PAINTED_COMPOSTER;
    public static Block RU_GREEN_PAINTED_COMPOSTER;
    public static Block RU_JOSHUA_COMPOSTER;
    public static Block RU_LARCH_COMPOSTER;
    public static Block RU_LIGHT_BLUE_PAINTED_COMPOSTER;
    public static Block RU_LIGHT_GRAY_PAINTED_COMPOSTER;
    public static Block RU_LIME_PAINTED_COMPOSTER;
    public static Block RU_MAGENTA_PAINTED_COMPOSTER;
    public static Block RU_MAPLE_COMPOSTER;
    public static Block RU_MAUVE_COMPOSTER;
    public static Block RU_ORANGE_PAINTED_COMPOSTER;
    public static Block RU_PALM_COMPOSTER;
    public static Block RU_PINE_COMPOSTER;
    public static Block RU_PINK_PAINTED_COMPOSTER;
    public static Block RU_PURPLE_PAINTED_COMPOSTER;
    public static Block RU_REDWOOD_COMPOSTER;
    public static Block RU_RED_PAINTED_COMPOSTER;
    public static Block RU_WHITE_PAINTED_COMPOSTER;
    public static Block RU_WILLOW_COMPOSTER;
    public static Block RU_YELLOW_PAINTED_COMPOSTER;

    public static Block RU_CHERRY_COMPOSTER;
    public static Block RU_SCULKWOOD_COMPOSTER;

    public static Block RU_BRIMWOOD_COMPOSTER;
    public static Block RU_COBALT_COMPOSTER;
    public static Block RU_KAPOK_COMPOSTER;
    public static Block RU_MAGNOLIA_COMPOSTER;
    public static Block RU_SOCOTRA_COMPOSTER;
    public static Block RU_YELLOW_BIOSHROOM_COMPOSTER;

    public static void registerComposters() {
        RU_ALPHA_OAK_COMPOSTER = registerComposter("ru_alpha_oak_composter");
        RU_BAOBAB_COMPOSTER = registerComposter("ru_baobab_composter");
        RU_BLACK_PAINTED_COMPOSTER = registerComposter("ru_black_painted_composter");
        RU_BLACKWOOD_COMPOSTER = registerComposter("ru_blackwood_composter");
        RU_BLUE_PAINTED_COMPOSTER = registerComposter("ru_blue_painted_composter");
        RU_BROWN_PAINTED_COMPOSTER = registerComposter("ru_brown_painted_composter");
        RU_CYAN_PAINTED_COMPOSTER = registerComposter("ru_cyan_painted_composter");
        RU_CYPRESS_COMPOSTER = registerComposter("ru_cypress_composter");
        RU_DEAD_COMPOSTER = registerComposter("ru_dead_composter");
        RU_EUCALYPTUS_COMPOSTER = registerComposter("ru_eucalyptus_composter");
        RU_GREEN_PAINTED_COMPOSTER = registerComposter("ru_green_painted_composter");
        RU_GRAY_PAINTED_COMPOSTER = registerComposter("ru_gray_painted_composter");
        RU_JOSHUA_COMPOSTER = registerComposter("ru_joshua_composter");
        RU_LARCH_COMPOSTER = registerComposter("ru_larch_composter");
        RU_LIGHT_BLUE_PAINTED_COMPOSTER = registerComposter("ru_light_blue_painted_composter");
        RU_LIGHT_GRAY_PAINTED_COMPOSTER = registerComposter("ru_light_gray_painted_composter");
        RU_LIME_PAINTED_COMPOSTER = registerComposter("ru_lime_painted_composter");
        RU_MAGENTA_PAINTED_COMPOSTER = registerComposter("ru_magenta_painted_composter");
        RU_MAPLE_COMPOSTER = registerComposter("ru_maple_composter");
        RU_MAUVE_COMPOSTER = registerComposter("ru_mauve_composter");
        RU_ORANGE_PAINTED_COMPOSTER = registerComposter("ru_orange_painted_composter");
        RU_PALM_COMPOSTER = registerComposter("ru_palm_composter");
        RU_PINE_COMPOSTER = registerComposter("ru_pine_composter");
        RU_PINK_PAINTED_COMPOSTER = registerComposter("ru_pink_painted_composter");
        RU_PURPLE_PAINTED_COMPOSTER = registerComposter("ru_purple_painted_composter");
        RU_RED_PAINTED_COMPOSTER = registerComposter("ru_red_painted_composter");
        RU_REDWOOD_COMPOSTER = registerComposter("ru_redwood_composter");
        RU_WHITE_PAINTED_COMPOSTER = registerComposter("ru_white_painted_composter");
        RU_WILLOW_COMPOSTER = registerComposter("ru_willow_composter");
        RU_YELLOW_PAINTED_COMPOSTER = registerComposter("ru_yellow_painted_composter");
    }
    
    public static void register04Composters() {
        RU_CHERRY_COMPOSTER = registerComposter("ru_cherry_composter");
        RU_SCULKWOOD_COMPOSTER = registerComposter("ru_sculkwood_composter");
    }

    public static void register05Composters() {
        RU_BRIMWOOD_COMPOSTER = registerComposter("ru_brimwood_composter");
        RU_COBALT_COMPOSTER = registerComposter("ru_cobalt_composter");
        RU_KAPOK_COMPOSTER = registerComposter("ru_kapok_composter");
        RU_MAGNOLIA_COMPOSTER = registerComposter("ru_magnolia_composter");
        RU_SOCOTRA_COMPOSTER = registerComposter("ru_socotra_composter");
        RU_YELLOW_BIOSHROOM_COMPOSTER = registerComposter("ru_yellow_bioshroom_composter");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        RU_COMPOSTERS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerComposter(String name) {
        return register(name, new VariantComposterBlock());
    }
}