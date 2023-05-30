package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Composters;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.ACACIA_COMPOSTER)
                .input('#', Blocks.ACACIA_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.ACACIA_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.ACACIA_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.ACACIA_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.BAMBOO_COMPOSTER)
                .input('#', Blocks.BAMBOO_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BAMBOO_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.BAMBOO_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.BIRCH_COMPOSTER)
                .input('#', Blocks.BIRCH_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BIRCH_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BIRCH_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.BIRCH_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.CHERRY_COMPOSTER)
                .input('#', Blocks.CHERRY_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.CHERRY_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.CHERRY_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.CHERRY_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.CRIMSON_COMPOSTER)
                .input('#', Blocks.CRIMSON_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.CRIMSON_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.CRIMSON_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.CRIMSON_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.DARK_OAK_COMPOSTER)
                .input('#', Blocks.DARK_OAK_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.DARK_OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.DARK_OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.DARK_OAK_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.JUNGLE_COMPOSTER)
                .input('#', Blocks.JUNGLE_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.JUNGLE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.JUNGLE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.JUNGLE_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.MANGROVE_COMPOSTER)
                .input('#', Blocks.MANGROVE_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.MANGROVE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.MANGROVE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.MANGROVE_COMPOSTER)));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.OAK_COMPOSTER)
                .input('#', Blocks.OAK_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.OAK_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.WARPED_COMPOSTER)
                .input('#', Blocks.WARPED_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.WARPED_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.WARPED_COMPOSTER)));
    }
}
