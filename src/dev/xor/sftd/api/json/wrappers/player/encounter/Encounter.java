package dev.xor.sftd.api.json.wrappers.player.encounter;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Encounter {
    private long id;

    public Encounter(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
