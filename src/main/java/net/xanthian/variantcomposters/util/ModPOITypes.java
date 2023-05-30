package net.xanthian.variantcomposters.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantcomposters.block.Composters;
import net.xanthian.variantcomposters.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {
        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> farmerEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FARMER).get();

        PointOfInterestType farmerPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FARMER);

        // NOTE: PointOfInterestType.blockStates is accessible by access widener
        List<BlockState> farmerBlockStates = new ArrayList<BlockState>(farmerPoiType.blockStates);

        for (Block block : Composters.MOD_COMPOSTERS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, farmerEntry);
            }

            farmerBlockStates.addAll(blockStates);
        }

        // NOTE: PointOfInterestType.blockStates is mutable by access widener
        farmerPoiType.blockStates = ImmutableSet.copyOf(farmerBlockStates);
    }
}