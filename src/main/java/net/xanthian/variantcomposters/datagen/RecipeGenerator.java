package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
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

import java.util.Map;
import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void offerComposterRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible composter, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, composter)
                .input('#', slab)
                .pattern("# #").pattern("# #").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(slab), FabricRecipeProvider.conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(composter)));
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

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

        registerComposterRecipe(exporter, AdAstra.AA_COMPOSTERS, "ad_astra");
        registerComposterRecipe(exporter, BeachParty.LDBP_COMPOSTERS, "beachparty");
        registerComposterRecipe(exporter, BetterArcheology.BA_COMPOSTERS, "betterarcheology");
        registerComposterRecipe(exporter, Bewitchment.BW_COMPOSTERS, "bewitchment");
        registerComposterRecipe(exporter, BiomeMakeover.BM_COMPOSTERS, "biomemakeover");
        registerComposterRecipe(exporter, Blockus.BLS_COMPOSTERS, "blockus");
        registerComposterRecipe(exporter, DeeperAndDarker.DAD_COMPOSTERS, "deeperdarker");
        registerComposterRecipe(exporter, EldritchEnd.EE_COMPOSTERS, "eldritch_end");
        registerComposterRecipe(exporter, MineCells.MC_COMPOSTERS, "minecells");
        registerComposterRecipe(exporter, NaturesSpirit.NS_COMPOSTERS, "natures_spirit");
        registerComposterRecipe(exporter, Promenade.PROM_COMPOSTERS, "promenade");
        registerComposterRecipe(exporter, RegionsUnexplored.RU_COMPOSTERS, "regions_unexplored");
        //registerComposterRecipe(exporter, SnifferPlus.SP_COMPOSTERS, "snifferplus");
        registerComposterRecipe(exporter, TechReborn.TR_COMPOSTERS, "techreborn");
        registerComposterRecipe(exporter, Vinery.LDV_COMPOSTERS, "vinery");

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.COMPOSTER, 1)
                .input(ModItemTags.COMPOSTERS)
                .criterion("has_composter", InventoryChangedCriterion.Conditions.items(Items.COMPOSTER))
                .offerTo(exporter, new Identifier("variantcomposters", "composter"));

    }

    public void registerComposterRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> composters, String modId) {
        registerComposterRecipe(exporter, composters, modId, "_slab");
    }

    public void registerComposterRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> composters, String modId, String slabSuffix) {
        for (Map.Entry<Identifier, Block> entry : composters.entrySet()) {
            Identifier composterId = entry.getKey();
            Block composter = entry.getValue();
            String path = composterId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String slabName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String slabPath = modId + ":" + slabName + slabSuffix;
                offerComposterRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(slabPath))))), composter, Registries.ITEM.get(new Identifier(slabPath)));
            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}