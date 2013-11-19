package dev.xor.sftd.api;


import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiHandler;

public abstract class Script {
    public Game game;
    public ApiHandler apiHandler;
    public Script(Game game){
        this.game = game;
        apiHandler = game.getApiHandler();
    }
    public abstract int loop();
}
