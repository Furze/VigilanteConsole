package dev.xor.sftd.api.json.wrappers.player.crew;


public class Crew {
    private int id;
    private String name;
    private String manifesto;
    private int leaderID;
    private Patch patch;

    public Crew(int id, String name, String manifesto, int leaderID, Patch patch) {
        this.id = id;
        this.name = name;
        this.manifesto = manifesto;
        this.leaderID = leaderID;
        this.patch = patch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManifesto() {
        return manifesto;
    }

    public int getLeaderID() {
        return leaderID;
    }

    public Patch getPatch() {
        return patch;
    }
}
