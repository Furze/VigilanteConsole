package dev.xor.sftd.api.json.wrappers.player;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Rank {
    private String id;
    private String name;
    private String fromLevel;

    public Rank(String id, String name, String fromLevel) {
        this.id = id;
        this.name = name;
        this.fromLevel = fromLevel;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFromLevel() {
        return fromLevel;
    }
}
