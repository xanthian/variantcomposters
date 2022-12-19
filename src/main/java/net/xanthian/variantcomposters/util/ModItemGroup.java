package net.xanthian.variantcomposters.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.Initialise;

import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final ItemGroup VARIANT_COMPOSTERS =
            FabricItemGroup.builder(new Identifier(Initialise.MOD_ID, "variant_composters"))
                    .displayName(Text.literal("Variant Composters"))
                    .icon(() -> new ItemStack(Blocks.COMPOSTER))
                    .entries((enabledFeatures, entries, operatorEnabled) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Initialise.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();

}