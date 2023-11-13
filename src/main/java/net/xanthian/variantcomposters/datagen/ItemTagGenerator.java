package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcomposters.util.ModItemTags.COMPOSTERS;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_COMPOSTERS);

        registerTags(AdAstra.AA_COMPOSTERS);
        registerTags(BeachParty.LDBP_COMPOSTERS);
        registerTags(BetterArcheology.BA_COMPOSTERS);
        registerTags(Bewitchment.BW_COMPOSTERS);
        registerTags(DeeperAndDarker.DAD_COMPOSTERS);
        registerTags(EldritchEnd.EE_COMPOSTERS);
        registerTags(MineCells.MC_COMPOSTERS);
        registerTags(NaturesSpirit.NS_COMPOSTERS);
        registerTags(Promenade.PROM_COMPOSTERS);
        registerTags(RegionsUnexplored.RU_COMPOSTERS);
        registerTags(SnifferPlus.SP_COMPOSTERS);
        registerTags(TechReborn.TR_COMPOSTERS);
        registerTags(Vinery.LDV_COMPOSTERS);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Item.fromBlock(Vanilla.CRIMSON_COMPOSTER))
                .add(Item.fromBlock(Vanilla.WARPED_COMPOSTER))
                .addOptional(new Identifier("variantcomposters:prom_dark_amaranth_composter"))
                .addOptional(new Identifier("variantcomposters:ru_brimwood_composter"))
                .addOptional(new Identifier("variantcomposters:ru_cobalt_composter"))
                .addOptional(new Identifier("variantcomposters:ru_dead_composter"))
                .addOptional(new Identifier("variantcomposters:ru_yellow_bioshroom_composter"));

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(COMPOSTERS);
    }
    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);

            getOrCreateTagBuilder(COMPOSTERS)
                    .addOptional(modifiedId);
        }
    }
}