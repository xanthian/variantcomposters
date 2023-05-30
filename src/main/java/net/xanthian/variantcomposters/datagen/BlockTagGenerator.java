package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Composters;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcomposters.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"composters"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(COMPOSTERS)
                .add(Composters.ACACIA_COMPOSTER)
                .add(Composters.BAMBOO_COMPOSTER)
                .add(Composters.BIRCH_COMPOSTER)
                .add(Composters.CHERRY_COMPOSTER)
                .add(Composters.CRIMSON_COMPOSTER)
                .add(Composters.DARK_OAK_COMPOSTER)
                .add(Composters.JUNGLE_COMPOSTER)
                .add(Composters.MANGROVE_COMPOSTER)
                .add(Composters.OAK_COMPOSTER)
                .add(Composters.WARPED_COMPOSTER);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(COMPOSTERS);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(COMPOSTERS);

    }
}
