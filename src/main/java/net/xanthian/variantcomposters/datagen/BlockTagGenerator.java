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
import net.xanthian.variantcomposters.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcomposters.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), Identifier.of(MOD_ID,"composters"));

    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), Identifier.of("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        registerTags(Vanilla.VANILLA_COMPOSTERS);

        //registerTags(AdAstra.AA_COMPOSTERS);
        //registerTags(BeachParty.LDBP_COMPOSTERS);
        //registerTags(BetterArcheology.BA_COMPOSTERS);
        //registerTags(Bewitchment.BW_COMPOSTERS);
        //registerTags(BiomeMakeover.BM_COMPOSTERS);
        //registerTags(Blockus.BLS_COMPOSTERS);
        //registerTags(Botania.BOT_COMPOSTERS);
        registerTags(Cinderscapes.CS_COMPOSTERS);
        //registerTags(DeeperAndDarker.DAD_COMPOSTERS);
        //registerTags(Desolation.DS_COMPOSTERS);
        //registerTags(Ecologics.ECO_COMPOSTERS);
        //registerTags(EldritchEnd.EE_COMPOSTERS);
        //registerTags(Meadow.LDM_COMPOSTERS);
        //registerTags(MineCells.MC_COMPOSTERS);
        registerTags(NaturesSpirit.NS_COMPOSTERS);
        //registerTags(Promenade.PROM_COMPOSTERS);
        //registerTags(RegionsUnexplored.RU_COMPOSTERS);
        //registerTags(SnifferPlus.SP_COMPOSTERS);
        registerTags(TechReborn.TR_COMPOSTERS);
        //registerTags(Vinery.LDV_COMPOSTERS);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(COMPOSTERS);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(COMPOSTERS);
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableKey().getValue();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = Identifier.of(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(COMPOSTERS)
                    .addOptional(modifiedId);
        }
    }
}