package net.xanthian.variantcomposters;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.xanthian.variantcomposters.blocks.Composters;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "variantcomposters";

	public static Identifier ID(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup VARIANT_COMPOSTERS = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "variant_composters"),
			() -> new ItemStack(Items.COMPOSTER));
	public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();

	@Override
	public void onInitialize() {

			Composters.addVanillaComposters();
			woodTypes.add(Pair.of("acacia", new String[0]));
			woodTypes.add(Pair.of("birch", new String[0]));
			woodTypes.add(Pair.of("dark_oak", new String[0]));
			woodTypes.add(Pair.of("jungle", new String[0]));
			woodTypes.add(Pair.of("oak", new String[0]));
			woodTypes.add(Pair.of("mangrove", new String[0]));
		if (!FabricLoader.getInstance().isModLoaded("betternether")) {
			Composters.addNetherComposters();
			woodTypes.add(Pair.of("crimson", new String[0]));
			woodTypes.add(Pair.of("warped", new String[0]));
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			Composters.addTechRebornComposters();
			woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
		}
		if (FabricLoader.getInstance().isModLoaded("arclight")) {
			Composters.addEpicPaladinsComposters();
			woodTypes.add(Pair.of("jade", new String[]{"arclight"}));
			woodTypes.add(Pair.of("moon", new String[]{"arclight"}));
			woodTypes.add(Pair.of("shadow", new String[]{"arclight"}));
		}
		if (FabricLoader.getInstance().isModLoaded("simplemango")) {
			Composters.addSimpleMangoComposters();
			woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
		}
	}
}