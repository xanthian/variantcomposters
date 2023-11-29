package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block composter : Vanilla.VANILLA_COMPOSTERS.values()) {
            addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        registerLootTables(AdAstra.AA_COMPOSTERS, "ad_astra");
        registerLootTables(BeachParty.LDBP_COMPOSTERS, "beachparty");
        registerLootTables(BetterArcheology.BA_COMPOSTERS, "betterarcheology");
        registerLootTables(Bewitchment.BW_COMPOSTERS, "bewitchment");
        registerLootTables(BiomeMakeover.BM_COMPOSTERS, "biome_makeover");
        registerLootTables(Blockus.BLS_COMPOSTERS, "blockus");
        registerLootTables(DeeperAndDarker.DAD_COMPOSTERS, "deeperdarker");
        registerLootTables(EldritchEnd.EE_COMPOSTERS, "eldritch_end");
        registerLootTables(MineCells.MC_COMPOSTERS, "minecells");
        registerSpecialLootTable(NaturesSpirit.NS_COMPOSTERS, "natures_spirit");
        registerLootTables(Promenade.PROM_COMPOSTERS, "promenade");
        registerSpecialLootTable(RegionsUnexplored.RU_COMPOSTERS, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_COMPOSTERS, "snifferplus");
        registerLootTables(TechReborn.TR_COMPOSTERS, "techreborn");
        registerLootTables(Vinery.LDV_COMPOSTERS, "vinery");
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block composter : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(composter, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
    }

    public void registerSpecialLootTable(Map<Identifier, Block> composters, String modId) {
        for (Map.Entry<Identifier, Block> entry : composters.entrySet()) {
            Identifier composterId = entry.getKey();
            Block composter = entry.getValue();
            String path = composterId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String slabName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String slabPath = modId + ":" + slabName + "_slab";
                withConditions(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                        DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(slabPath)))))
                        .addDrop(composter, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}