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

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block composter : Vanilla.MOD_COMPOSTERS.values()) {
            addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        // Ad Astra
        for (Block composter : AdAstra.AA_COMPOSTERS.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("ad_astra")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        // Beach Party (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Better Archeology
        withConditions(DefaultResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Bewitchment
        for (Block composter : Bewitchment.BW_COMPOSTERS.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("bewitchment")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
        // Deeper & Darker
        withConditions(DefaultResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Mine Cells
        withConditions(DefaultResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Nature's Spirit
        for (Block composter : NaturesSpirit.NS_COMPOSTERS.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("natures_spirit")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        // Promenade
        for (Block composter : Promenade.PROM_COMPOSTERS.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("promenade")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        // Regions Unexplored
        for (Block composter : RegionsUnexplored.RU_COMPOSTERS.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("regions_unexplored")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        // SnifferPlus
        withConditions(DefaultResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Tech reborn
        withConditions(DefaultResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        // Vinery (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
    }
}