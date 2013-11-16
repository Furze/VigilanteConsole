package dev.xor.sftd.api.json.wrappers.deserializers.player;

import dev.xor.sftd.api.json.wrappers.player.Item;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class ItemDeserializer {
    public static Item[] deserializer(JSONArray json){
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i< json.length();i++){
            JSONObject js = json.getJSONObject(i);
            items.add(new Item(js.getInt("x"),js.getInt("y"),js.getString("item_id")));
        }
        return items.toArray(new Item[items.size()]);
    }
}
