package dev.xor.sftd.api.json.wrappers.player;

public class Status {

    private String name;
    private long expires;

    public Status(String name, long expires) {
        this.name = name;
        this.expires = expires;
    }

    public String getName() {
        return name;
    }

    public long getExpires() {
        return expires;
    }
}
