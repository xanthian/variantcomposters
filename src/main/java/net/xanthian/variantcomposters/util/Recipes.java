package net.xanthian.variantcomposters.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.variantcomposters.Init.MOD_ID;


public class Recipes {

    // Vanilla
    public static JsonObject createVanillaComposterRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("S S");
        pattern.add("S S");
        pattern.add("SSS");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_slab");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_composter");
        json.add("result", result);
        return json;
    }

    // Annoying mods that prefixes slab with _plank
    public static JsonObject createUghBarrelRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("S S");
        pattern.add("S S");
        pattern.add("SSS");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_plank_slab");
        keyList.add("S", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_composter");
        json.add("result", result);
        return json;
    }
}