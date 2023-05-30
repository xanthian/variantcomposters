package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Composters;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcomposters.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> COMPOSTERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"composters"));
        private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
        private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(COMPOSTERS)
                    .add(Item.fromBlock(Composters.ACACIA_COMPOSTER))
                    .add(Item.fromBlock(Composters.BAMBOO_COMPOSTER))
                    .add(Item.fromBlock(Composters.BIRCH_COMPOSTER))
                    .add(Item.fromBlock(Composters.CHERRY_COMPOSTER))
                    .add(Item.fromBlock(Composters.CRIMSON_COMPOSTER))
                    .add(Item.fromBlock(Composters.DARK_OAK_COMPOSTER))
                    .add(Item.fromBlock(Composters.JUNGLE_COMPOSTER))
                    .add(Item.fromBlock(Composters.MANGROVE_COMPOSTER))
                    .add(Item.fromBlock(Composters.OAK_COMPOSTER))
                    .add(Item.fromBlock(Composters.WARPED_COMPOSTER));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Item.fromBlock(Composters.CRIMSON_COMPOSTER))
                    .add(Item.fromBlock(Composters.WARPED_COMPOSTER));

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(COMPOSTERS);
        }
    }