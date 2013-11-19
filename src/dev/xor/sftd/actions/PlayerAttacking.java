package dev.xor.sftd.actions;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Script;
import dev.xor.sftd.api.methods.sftd.api.encounters.Acknowledge;
import dev.xor.sftd.api.methods.sftd.api.encounters.Initiate;
import dev.xor.sftd.api.methods.sftd.api.encounters.Monitor;
import dev.xor.sftd.api.methods.sftd.api.investigate.InvestigatePlayer;
import dev.xor.sftd.api.methods.sftd.api.players.Status;
import dev.xor.sftd.api.methods.sftd.misc.MathHelpers;
import org.json.JSONException;
import org.json.JSONObject;


public class PlayerAttacking extends Script {
    public PlayerAttacking(Game game){
        super(game);
    }
    public int loop(){
        apiHandler.handle(new Status());
        if(game.getCurrentEvent()!= null){
            apiHandler.handle(new Monitor(game.getCurrentEvent().getId()));
             apiHandler.handle(new Acknowledge(game.getCurrentEvent().getId()));
        }
        String player = "" + (int) (Math.random() * 58283);
        try{
            JSONObject json = new JSONObject(apiHandler.handle(new InvestigatePlayer(player)).getResponse());

        int level = Integer.parseInt(json.getString("level"));
        //System.out.println(level +": " +json.has("crew"));
        if (20 < level && level < 100 && !json.has("crew")){
            apiHandler.handle(new Initiate(player, "out_of_bounds", "8"));  //mark
            apiHandler.handle(new Initiate(player, "dead_on_arrival", "7"));  //kill
        }
        } catch (JSONException e){
            System.err.println("Derrps " + e.getMessage());
        }
        return MathHelpers.random(1000, 3000);
    }
}
