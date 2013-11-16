package dev.xor.sftd.api.json.wrappers;


import dev.xor.sftd.api.json.wrappers.player.crew.Crew;
import dev.xor.sftd.api.json.wrappers.player.encounter.EncounterType;
import dev.xor.sftd.api.json.wrappers.player.Avatar;
import dev.xor.sftd.api.json.wrappers.player.Item;
import dev.xor.sftd.api.json.wrappers.player.Rank;
import dev.xor.sftd.api.json.wrappers.player.Status;
import dev.xor.sftd.api.json.wrappers.player.vehicle.Vehicle;

public class Player {
    private int id;
    private int status;
    private String name;
    private Avatar avatar;
    private int locationID;
    private int level;
    private int xp;
    private int baseStrength;
    private int baseSpeed;
    private int baseSkill;
    private Vehicle vehicle;
    private Item[] itemBundle;
    private EncounterType[] encounterTypes;
    private Status statusEffects;
    private int money;
    private int credits;
    private int income;
    private int stream;
    private int effectiveStrength;
    private int effectiveSpeed;
    private int effectiveSkill;
    private Item primaryItem;
    private int investigationPoints;
    private int crewID;
    private int crewConfirmed;
    private int crewLastChatID;
    private int lastAttackedInnocentCount;
    private int lastAttackedCriminalCount;
    private int hasStfdWarning;
    private String pushFrequency;
    private int lastIncentivisedInviteLevel;
    private Rank rank;
    private Crew crew;


}
