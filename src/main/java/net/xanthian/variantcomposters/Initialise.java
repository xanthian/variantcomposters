package net.xanthian.variantcomposters;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantcomposters.block.Composters;
import net.xanthian.variantcomposters.util.ModPOITypes;
import net.xanthian.variantcomposters.util.ModRegistries;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "variantcomposters";

	public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantcomposters"));

	@Override
	public void onInitialize() {
		// Custom Item Group
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("variantcomposters.group.variantcomposters"))
				.icon(() -> new ItemStack(Composters.MANGROVE_COMPOSTER))
				.entries((context, entries) -> {
					entries.add(Composters.ACACIA_COMPOSTER);
					entries.add(Composters.BAMBOO_COMPOSTER);
					entries.add(Composters.BIRCH_COMPOSTER);
					entries.add(Composters.CHERRY_COMPOSTER);
					entries.add(Composters.CRIMSON_COMPOSTER);
					entries.add(Composters.DARK_OAK_COMPOSTER);
					entries.add(Composters.JUNGLE_COMPOSTER);
					entries.add(Composters.MANGROVE_COMPOSTER);
					entries.add(Composters.OAK_COMPOSTER);
					entries.add(Blocks.COMPOSTER); // Spruce
					entries.add(Composters.WARPED_COMPOSTER);
				})
				.build());

		// Composter Registration
		Composters.registerVanillaComposters();

		// Fuel & Flammable Block registration
		ModRegistries.registerFuelandFlammable();

		// Farmer POI Registration
		ModPOITypes.init();

	}
}