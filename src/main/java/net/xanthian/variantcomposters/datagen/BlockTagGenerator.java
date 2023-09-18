package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.block.Vanilla;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcomposters.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"composters"));

    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(COMPOSTERS)
                .add(Vanilla.ACACIA_COMPOSTER)
                .add(Vanilla.BAMBOO_COMPOSTER)
                .add(Vanilla.BIRCH_COMPOSTER)
                .add(Vanilla.CHERRY_COMPOSTER)
                .add(Vanilla.CRIMSON_COMPOSTER)
                .add(Vanilla.DARK_OAK_COMPOSTER)
                .add(Vanilla.JUNGLE_COMPOSTER)
                .add(Vanilla.MANGROVE_COMPOSTER)
                .add(Vanilla.OAK_COMPOSTER)
                .add(Vanilla.WARPED_COMPOSTER)

                .addOptional(new Identifier("variantcomposters:aa_aeronos_composter"))
                .addOptional(new Identifier("variantcomposters:aa_glacian_composter"))
                .addOptional(new Identifier("variantcomposters:aa_stropar_composter"))

                .addOptional(new Identifier("variantcomposters:ldbp_palm_composter"))

                .addOptional(new Identifier("variantcomposters:ba_rotten_composter"))

                .addOptional(new Identifier("variantcomposters:bw_cypress_composter"))
                .addOptional(new Identifier("variantcomposters:bw_dragons_blood_composter"))
                .addOptional(new Identifier("variantcomposters:bw_elder_composter"))
                .addOptional(new Identifier("variantcomposters:bw_juniper_composter"))

                .addOptional(new Identifier("variantcomposters:dad_echo_composter"))

                .addOptional(new Identifier("variantcomposters:mc_putrid_composter"))

                .addOptional(new Identifier("variantcomposters:ns_aspen_composter"))
                .addOptional(new Identifier("variantcomposters:ns_cypress_composter"))
                .addOptional(new Identifier("variantcomposters:ns_fir_composter"))
                .addOptional(new Identifier("variantcomposters:ns_joshua_composter"))
                .addOptional(new Identifier("variantcomposters:ns_maple_composter"))
                .addOptional(new Identifier("variantcomposters:ns_olive_composter"))
                .addOptional(new Identifier("variantcomposters:ns_redwood_composter"))
                .addOptional(new Identifier("variantcomposters:ns_sugi_composter"))
                .addOptional(new Identifier("variantcomposters:ns_willow_composter"))
                .addOptional(new Identifier("variantcomposters:ns_wisteria_composter"))

                .addOptional(new Identifier("variantcomposters:prom_dark_amaranth_composter"))
                .addOptional(new Identifier("variantcomposters:prom_maple_composter"))
                .addOptional(new Identifier("variantcomposters:prom_palm_composter"))
                .addOptional(new Identifier("variantcomposters:prom_sakura_composter"))

                .addOptional(new Identifier("variantcomposters:ru_alpha_oak_composter"))
                .addOptional(new Identifier("variantcomposters:ru_baobab_composter"))
                .addOptional(new Identifier("variantcomposters:ru_black_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_blackwood_composter"))
                .addOptional(new Identifier("variantcomposters:ru_blue_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_brown_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_cherry_composter"))
                .addOptional(new Identifier("variantcomposters:ru_cyan_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_cypress_composter"))
                .addOptional(new Identifier("variantcomposters:ru_dead_composter"))
                .addOptional(new Identifier("variantcomposters:ru_eucalyptus_composter"))
                .addOptional(new Identifier("variantcomposters:ru_green_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_gray_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_joshua_composter"))
                .addOptional(new Identifier("variantcomposters:ru_larch_composter"))
                .addOptional(new Identifier("variantcomposters:ru_light_blue_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_light_gray_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_lime_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_magenta_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_maple_composter"))
                .addOptional(new Identifier("variantcomposters:ru_mauve_composter"))
                .addOptional(new Identifier("variantcomposters:ru_orange_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_palm_composter"))
                .addOptional(new Identifier("variantcomposters:ru_pine_composter"))
                .addOptional(new Identifier("variantcomposters:ru_pink_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_purple_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_red_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_redwood_composter"))
                .addOptional(new Identifier("variantcomposters:ru_sculkwood_composter"))
                .addOptional(new Identifier("variantcomposters:ru_white_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_willow_composter"))
                .addOptional(new Identifier("variantcomposters:ru_yellow_painted_composter"))
                .addOptional(new Identifier("variantcomposters:ru_brimwood_composter"))
                .addOptional(new Identifier("variantcomposters:ru_cobalt_composter"))
                .addOptional(new Identifier("variantcomposters:ru_kapok_composter"))
                .addOptional(new Identifier("variantcomposters:ru_magnolia_composter"))
                .addOptional(new Identifier("variantcomposters:ru_socotra_composter"))
                .addOptional(new Identifier("variantcomposters:ru_yellow_bioshroom_composter"))

                .addOptional(new Identifier("variantcomposters:sp_stone_pine_composter"))

                .addOptional(new Identifier("variantcomposters:tr_rubber_composter"))

                .addOptional(new Identifier("variantcomposters:ldv_cherry_composter"));

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(COMPOSTERS);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(COMPOSTERS);
    }
}