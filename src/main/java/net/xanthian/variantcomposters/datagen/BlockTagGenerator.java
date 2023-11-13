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
    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "composters"));
    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

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

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(COMPOSTERS);

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