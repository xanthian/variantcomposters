package net.xanthian.variantcomposters;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;

import net.xanthian.variantcomposters.block.Vanilla;
import net.xanthian.variantcomposters.block.compatability.*;
import net.xanthian.variantcomposters.util.ModCreativeTab;
import net.xanthian.variantcomposters.util.ModPOITypes;
import net.xanthian.variantcomposters.util.ModRegistries;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "variantcomposters";

	@Override
	public void onInitialize() {

		Vanilla.registerVanillaComposters();

		ifModLoaded("ad_astra", AdAstra::registerComposters);

		ifModLoaded("beachparty", BeachParty::registerComposters);

		ifModLoaded("betterarcheology", BetterArcheology::registerComposters);

		ifModLoaded("bewitchment", Bewitchment::registerComposters);

		ifModLoaded("deeperdarker", DeeperAndDarker::registerComposters);

		ifModLoaded("minecells", MineCells::registerComposters);

		ifModLoaded("natures_spirit", NaturesSpirit::registerComposters);

		ifModLoaded("promenade", Promenade::registerComposters);

		ifModLoaded("regions_unexplored", () -> {
			RegionsUnexplored.registerComposters();
			if (isModVersion("regions_unexplored", "0.4")) {
				RegionsUnexplored.register04Composters();
			} else {
				RegionsUnexplored.register05Composters();
			}
		});

		ifModLoaded("snifferplus", SnifferPlus::registerComposters);

		ifModLoaded("techreborn", TechReborn::registerComposters);

		ifModLoaded("vinery", Vinery::registerComposters);

		ModRegistries.registerFuelandFlammable();
		ModCreativeTab.registerItemGroup();
		ModPOITypes.init();

		// Datagen Block - disable for client run
		//SnifferPlus.registerComposters();
		//RegionsUnexplored.register04Composters();
		//NaturesSpirit.registerComposters();
		//DeeperAndDarker.registerComposters();
		//AdAstra.registerComposters();

	}

	public static void ifModLoaded(String modId, Runnable runnable) {
		if (FabricLoader.getInstance().isModLoaded(modId)) {
			runnable.run();
		}
	}
	public static boolean isModVersion(String modId, String ver) {
		return FabricLoader.getInstance()
				.getModContainer(modId)
				.map(ModContainer::getMetadata)
				.map(ModMetadata::getVersion)
				.map(Version::getFriendlyString)
				.filter(version -> version.startsWith(ver))
				.isPresent();
	}
}