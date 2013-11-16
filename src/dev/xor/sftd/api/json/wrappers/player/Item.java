package dev.xor.sftd.api.json.wrappers.player;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private int x;
    private int y;
    private String itemID;

    public Item(int x, int y, String itemID) {
        this.x = x;
        this.y = y;
        this.itemID = itemID;
        //TODO: look up item stats from item json
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getItemID() {
        return itemID;
    }
}
