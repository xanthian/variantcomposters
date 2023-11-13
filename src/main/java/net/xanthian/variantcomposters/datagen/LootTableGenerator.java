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
        registerLootTables(DeeperAndDarker.DAD_COMPOSTERS, "deeperdarker");
        registerLootTables(EldritchEnd.EE_COMPOSTERS, "eldritch_end");
        registerLootTables(MineCells.MC_COMPOSTERS, "minecells");
        registerLootTables(NaturesSpirit.NS_COMPOSTERS, "natures_spirit");
        registerLootTables(Promenade.PROM_COMPOSTERS, "promenade");
        registerLootTables(RegionsUnexplored.RU_COMPOSTERS, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_COMPOSTERS, "snifferplus");
        registerLootTables(TechReborn.TR_COMPOSTERS, "techreborn");
        registerLootTables(Vinery.LDV_COMPOSTERS, "vinery");
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block composter : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(composter, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
    }
}