package dev.xor.sftd.api.json.wrappers.deserializers.player;


import dev.xor.sftd.api.json.wrappers.Player;
import dev.xor.sftd.api.json.wrappers.player.Item;
import dev.xor.sftd.api.json.wrappers.player.Status;
import dev.xor.sftd.api.json.wrappers.player.encounter.EncounterType;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class PlayerDeserializer {
    //{"player":
    // {
    // "crew":{"id":"2884", "chat_count":2, "leader_id":"21686", "manifesto":"In time man created nuclear and chemical weapons. Thus bringing forward complete world devastation. Time is now. We are the weapons",
    // "name":"W.M.D", "patch":{"pattern":6,"symbol":21,"symbol_color":4,"pattern_color":6,"background_color":3}},
    //
    // }
    // }
    public static Player deserializer(JSONObject json){
        JSONObject js = json.getJSONObject("player");
        Player player = new Player(js.getString("id"));
        player.setName(js.getString("name"));
        player.setInvestigationPoints(js.getString("investigation_points"));
        player.setMoney(js.getString("money"));
        player.setIncome(js.getString("income"));
        player.setLevel(js.getString("level"));
        player.setCrewID(js.getString("crew_id"));
        player.setCredits(js.getString("credits"));
        player.setXp(js.getString("xp"));
        player.setLastBossLevel(js.getString("last_boss_level"));
        player.setStream(js.getString("stream"));
        player.setRank(RankDeserializer.deserialize(js.getJSONObject("rank")));
        player.setPrimaryItem(js.getString("primary_item_id"));
        player.setVehicleId(js.getString("vehicle_id"));
        player.setLastIncentivisedInviteLevel(js.getString("last_incentivised_invite_level"));
        player.setHadStfdWarning(js.getString("had_sftd_warning"));
        player.setEffectiveStrength(js.getInt("effective_strength"));
        player.setBaseStrength(js.getString("base_strength"));
        player.setEffectiveSkill(js.getString("effective_skill"));
        player.setBaseSkill(js.getString("base_skill"));
        player.setEffectiveSpeed(js.getString("effective_speed"));
        player.setBaseSpeed(js.getString("base_speed"));
        player.setCrewLastChatID(js.getString("crew_last_chat_id"));
        player.setLastAttackedInnocentCount(js.getString("last_attacked_innocent_count"));
        player.setLastAttackedCriminalCount(js.getString("last_attacked_criminal_count"));
        player.setEncounterTypes(EncounterTypeDeserializer.deserializer(js.getJSONArray("encounter_types")));
        player.setItemBundle(ItemDeserializer.deserializer(js.getJSONArray("item_bundle")));
        player.setLocationID(js.getString("location_id"));
        player.setAvatar(AvatarDeserializer.deserialize(js.getJSONObject("avatar")));
        player.setPushFrequency(js.getString("push_frequency"));
        player.setStatus(js.getString("status"));
        player.setCrewConfirmed(js.getString("crew_confirmed"));



        return player;
    }

}
class EncounterTypeDeserializer{
    public static EncounterType[] deserializer(JSONArray json){
        ArrayList<EncounterType> encounterTypes = new ArrayList<>();
        for(int i = 0; i < json.length(); i++){
            encounterTypes.add(new EncounterType(json.getString(i)));
        }
        return encounterTypes.toArray(new EncounterType[encounterTypes.size()]);
    }
}
class StatusDeserializer{
    //"status_effects":{"bruised":1384600380},
    public static Status[] deserializer(JSONObject json){

         //bruised
        //bleeding
        //killed
        //todo: impliment yo
       return null;

    }

}
