package dev.xor.sftd.actions;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Script;
import dev.xor.sftd.api.methods.sftd.api.encounters.Initiate;
import dev.xor.sftd.api.methods.sftd.misc.MathHelpers;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 19/11/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class DOSScript extends Script {
    public DOSScript(Game game){
        super(game);
    }
    @Override
    public int loop() {
        //JSONObject jsonObject = new JSONObject("{\"target_type\":\"player\",\"punishment_id\":\"3\",\"encountertype_id\":\"out_of_bounds\",\"target_id\":\"35281\"}");
        //apiHandler.handle(new Initiate("35281", "100k_nudge", "1"));    //threaten
       // apiHandler.handle(new Initiate("35281", "same_place_same_time", "2"));  //humiliate
       // apiHandler.handle(new Initiate("35281", "out_of_bounds", "3"));  //hospitalize
       // apiHandler.handle(new Initiate("35281", "100k_nudge", "4")); //cripple
       // apiHandler.handle(new Initiate("35281", "out_of_bounds", "5"));  //bleed,
       // apiHandler.handle(new Initiate("35281", "100k_nudge", "6")); //leave for dead
        // apiHandler.handle(new Initiate("35281", "out_of_bounds", "8"));  //mark
        //apiHandler.handle(new Initiate("35281", "dead_on_arrival", "7"));  //kill

        return MathHelpers.random(0,2);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
