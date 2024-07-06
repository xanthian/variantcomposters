package net.xanthian.variantcomposters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.predicate.StatePredicate;

import net.minecraft.registry.RegistryWrapper;
import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;

import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        for (Block composter : Vanilla.VANILLA_COMPOSTERS.values()) {
            addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
        for (Block composter : Cinderscapes.CS_COMPOSTERS.values()) {
            withConditions(ResourceConditions.allModsLoaded("cinderscapes")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
        for (Block composter : NaturesSpirit.NS_COMPOSTERS.values()) {
            withConditions(ResourceConditions.allModsLoaded("natures_spirit")).addDrop(composter, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        }
        withConditions(ResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_COMPOSTER, block -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(block)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
    }
}