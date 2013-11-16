package dev.xor.sftd.api.json.wrappers;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Friend {
    private int playerID;

    public Friend(int playerID) {
        this.playerID = playerID;
    }

    public int getPlayerID() {
        return playerID;
    }
    public String toString(){
        return "" + playerID;
    }
}
