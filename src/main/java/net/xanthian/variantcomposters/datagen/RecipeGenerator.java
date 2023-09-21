package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;
import net.xanthian.variantcomposters.util.ModItemTags;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerComposterRecipe(exporter, Vanilla.ACACIA_COMPOSTER, Blocks.ACACIA_SLAB);
        offerComposterRecipe(exporter, Vanilla.BAMBOO_COMPOSTER, Blocks.BAMBOO_SLAB);
        offerComposterRecipe(exporter, Vanilla.BIRCH_COMPOSTER, Blocks.BIRCH_SLAB);
        offerComposterRecipe(exporter, Vanilla.CHERRY_COMPOSTER, Blocks.CHERRY_SLAB);
        offerComposterRecipe(exporter, Vanilla.CRIMSON_COMPOSTER, Blocks.CRIMSON_SLAB);
        offerComposterRecipe(exporter, Vanilla.DARK_OAK_COMPOSTER, Blocks.DARK_OAK_SLAB);
        offerComposterRecipe(exporter, Vanilla.JUNGLE_COMPOSTER, Blocks.JUNGLE_SLAB);
        offerComposterRecipe(exporter, Vanilla.MANGROVE_COMPOSTER, Blocks.MANGROVE_SLAB);
        offerComposterRecipe(exporter, Vanilla.OAK_COMPOSTER, Blocks.OAK_SLAB);
        offerComposterRecipe(exporter, Vanilla.WARPED_COMPOSTER, Blocks.WARPED_SLAB);

        // Ad Astra (disabled)
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),AdAstra.AA_AERONOS_COMPOSTER, Registries.ITEM.get(new Identifier("adastra:strophar_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),AdAstra.AA_GLACIAN_COMPOSTER, Registries.ITEM.get(new Identifier("adastra:strophar_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),AdAstra.AA_STROPHAR_COMPOSTER, Registries.ITEM.get(new Identifier("adastra:strophar_slab")));
        
        // Beach Party (Lets Do)
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("beachparty")), BeachParty.LDBP_PALM_COMPOSTER, Registries.ITEM.get(new Identifier("beachparty:palm_slab")));
       
        // Better Archeology
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("betterarcheology")),BetterArcheology.BA_ROTTEN_COMPOSTER, Registries.ITEM.get(new Identifier("betterarcheology:rotten_slab")));
       
        // Bewitchment
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),Bewitchment.BW_CYPRESS_COMPOSTER, Registries.ITEM.get(new Identifier("bewitchment:cypress_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),Bewitchment.BW_DRAGONS_BLOOD_COMPOSTER, Registries.ITEM.get(new Identifier("bewitchment:dragons_blood_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),Bewitchment.BW_ELDER_COMPOSTER, Registries.ITEM.get(new Identifier("bewitchment:elder_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),Bewitchment.BW_JUNIPER_COMPOSTER, Registries.ITEM.get(new Identifier("bewitchment:juniper_slab")));
        
        // Deeper & Darker (disabled)
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("deeperdarker")),DeeperAndDarker.DAD_ECHO_COMPOSTER, Registries.ITEM.get(new Identifier("deeperanddarker:echo_slab")));

        // Minecells
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("minecells")), MineCells.MC_PUTRID_COMPOSTER, Registries.ITEM.get(new Identifier("minecells:putrid_slab")));

        // Natures Spirit (disabled)
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_ASPEN_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:aspen_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_CYPRESS_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:cypress_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_FIR_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:fir_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_JOSHUA_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:joshua_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_MAPLE_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:maple_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_OLIVE_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:olive_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_REDWOOD_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:redwood_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_SUGI_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:sugi_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_WILLOW_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:willow_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_WISTERIA_COMPOSTER, Registries.ITEM.get(new Identifier("natures_spirit:wisteria_slab")));

        // Promenade
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),Promenade.PROM_DARK_AMARANTH_COMPOSTER, Registries.ITEM.get(new Identifier("promenade:dark_amaranth_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),Promenade.PROM_MAPLE_COMPOSTER, Registries.ITEM.get(new Identifier("promenade:maple_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),Promenade.PROM_PALM_COMPOSTER, Registries.ITEM.get(new Identifier("promenade:palm_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),Promenade.PROM_SAKURA_COMPOSTER, Registries.ITEM.get(new Identifier("promenade:sakura_slab")));
        
        // Regions Unexplored
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_ALPHA_OAK_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:alpha_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_BAOBAB_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:baobab_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_BLACK_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:black_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_BLACKWOOD_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:blackwood_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_BLUE_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:blue_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_BROWN_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:brown_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_CYAN_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:cyan_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_CYPRESS_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:cypress_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_DEAD_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:dead_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_EUCALYPTUS_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:eucalyptus_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_GREEN_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:green_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_GRAY_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:gray_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_JOSHUA_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:joshua_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_LARCH_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:larch_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:light_blue_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:light_gray_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_LIME_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:lime_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_MAGENTA_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:magenta_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_MAPLE_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:maple_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_MAUVE_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:mauve_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_ORANGE_PAINTED_COMPOSTER,  Registries.ITEM.get(new Identifier("regions_unexplored:orange_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_PALM_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:palm_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_PINE_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:pine_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_PINK_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:pink_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_PURPLE_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:purple_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_RED_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:red_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_REDWOOD_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:redwood_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_WHITE_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:white_painted_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_WILLOW_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:willow_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RegionsUnexplored.RU_YELLOW_PAINTED_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_painted_slab")));
        //0.4.1 (disabled)
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:cherry_slab"))))), RegionsUnexplored.RU_CHERRY_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:cherry_slab")));
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:sculkwood_slab"))))), RegionsUnexplored.RU_SCULKWOOD_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_slab")));
        //0.5.0
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:brimwood_slab"))))), RegionsUnexplored.RU_BRIMWOOD_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:brimwood_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:cobalt_slab"))))), RegionsUnexplored.RU_COBALT_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:cobalt_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:kapok_slab"))))), RegionsUnexplored.RU_KAPOK_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:kapok_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:magnolia_slab"))))), RegionsUnexplored.RU_MAGNOLIA_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:magnolia_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:socotra_slab"))))), RegionsUnexplored.RU_SOCOTRA_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:socotra_slab")));
        offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:yellow_bioshroom_slab"))))), RegionsUnexplored.RU_YELLOW_BIOSHROOM_COMPOSTER, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_bioshroom_slab")));

        // SnifferPlus (disabled)
        //offerComposterRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("snifferplus")),HellionsSniffer.HS_STONE_PINE_COMPOSTER, Registries.ITEM.get(new Identifier("snifferplus:stone_pine_slab")));
        
        // Tech Reborn
        offerComposterRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("techreborn")),TechReborn.TR_RUBBER_COMPOSTER, Registries.ITEM.get(new Identifier("techreborn:rubber_slab")));
        
        // Vinery (Lets Do)
        offerComposterRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("vinery")),Vinery.LDV_CHERRY_COMPOSTER, Registries.ITEM.get(new Identifier("vinery:cherry_slab")));


        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.COMPOSTER,1)
                .input(ModItemTags.COMPOSTERS)
                .criterion("has_composter", InventoryChangedCriterion.Conditions.items(Items.COMPOSTER))
                .offerTo(exporter,new Identifier("variantcomposters", "composter"));

    }

    public static void offerComposterRecipe(RecipeExporter exporter, ItemConvertible composter, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, composter)
                .input('#', slab)
                .pattern("# #").pattern("# #").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(slab), FabricRecipeProvider.conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(composter)));
    }
}