package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.block.Composters;
import net.xanthian.variantcomposters.util.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        RecipeGenerator.offerComposterRecipe(exporter,Composters.ACACIA_COMPOSTER, Blocks.ACACIA_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.BAMBOO_COMPOSTER, Blocks.BAMBOO_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.BIRCH_COMPOSTER, Blocks.BIRCH_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.CHERRY_COMPOSTER, Blocks.CHERRY_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.CRIMSON_COMPOSTER, Blocks.CRIMSON_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.DARK_OAK_COMPOSTER, Blocks.DARK_OAK_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.JUNGLE_COMPOSTER, Blocks.JUNGLE_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.MANGROVE_COMPOSTER, Blocks.MANGROVE_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.OAK_COMPOSTER, Blocks.OAK_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter,Composters.WARPED_COMPOSTER, Blocks.WARPED_SLAB);

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.COMPOSTER,1)
                .input(ModItemTags.COMPOSTERS)
                .criterion("has_composter", InventoryChangedCriterion.Conditions.items(Items.COMPOSTER))
                .offerTo(exporter,new Identifier("variantcomposters", "composter"));

    }

    public static void offerComposterRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input('#', input)
                .pattern("# #").pattern("# #").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}