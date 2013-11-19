package dev.xor.sftd.actions;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Script;
import dev.xor.sftd.api.methods.sftd.api.encounters.Acknowledge;
import dev.xor.sftd.api.methods.sftd.api.encounters.Monitor;
import dev.xor.sftd.api.methods.sftd.api.investigate.InvestigatePlayer;
import dev.xor.sftd.api.methods.sftd.api.players.Status;
import dev.xor.sftd.api.methods.sftd.misc.MathHelpers;


public class IPBoosting extends Script {
    public IPBoosting(Game game){
        super(game);
    }
    public int loop(){
        apiHandler.handle(new Status());
        if(game.getCurrentEvent()!= null){
            apiHandler.handle(new Monitor(game.getCurrentEvent().getId()));
             apiHandler.handle(new Acknowledge(game.getCurrentEvent().getId()));
        }
        apiHandler.handle(new InvestigatePlayer("" + (int) (Math.random() * 58283))).getResponse();

        return MathHelpers.random(0, 1);
    }
}
