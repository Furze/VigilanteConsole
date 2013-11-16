package dev.xor.sftd.api.json.wrappers;


import dev.xor.sftd.api.json.wrappers.player.crew.Crew;
import dev.xor.sftd.api.json.wrappers.player.encounter.EncounterType;
import dev.xor.sftd.api.json.wrappers.player.Avatar;
import dev.xor.sftd.api.json.wrappers.player.Item;
import dev.xor.sftd.api.json.wrappers.player.Rank;
import dev.xor.sftd.api.json.wrappers.player.Status;
import dev.xor.sftd.api.json.wrappers.player.vehicle.Vehicle;

public class Player {
    private String id;
    private String status;
    private String name;
    private Avatar avatar;
    private String locationID;
    private String level;
    private String xp;
    private String baseStrength;
    private String baseSpeed;
    private String baseSkill;
    private Vehicle vehicle;
    private Item[] itemBundle;
    private EncounterType[] encounterTypes;
    private Status statusEffects;
    private String money;
    private String credits;
    private String income;
    private String stream;
    private int effectiveStrength;
    private String effectiveSpeed;
    private String effectiveSkill;
    private String primaryItem;
    private String investigationPoints;
    private String crewID;
    private String crewConfirmed;
    private String crewLastChatID;
    private String lastAttackedInnocentCount;
    private String lastAttackedCriminalCount;
    private String hadStfdWarning;
    private String pushFrequency;
    private String lastIncentivisedInviteLevel;
    private Rank rank;
    private Crew crew;
    private String lastBossLevel;

    public Player(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Item[] getItemBundle() {
        return itemBundle;
    }

    public void setItemBundle(Item[] itemBundle) {
        this.itemBundle = itemBundle;
    }

    public EncounterType[] getEncounterTypes() {
        return encounterTypes;
    }

    public void setEncounterTypes(EncounterType[] encounterTypes) {
        this.encounterTypes = encounterTypes;
    }

    public Status getStatusEffects() {
        return statusEffects;
    }

    public void setStatusEffects(Status statusEffects) {
        this.statusEffects = statusEffects;
    }

    public String getPrimaryItem() {
        return primaryItem;
    }

    public void setPrimaryItem(String primaryItem) {
        this.primaryItem = primaryItem;
    }


    public String getCrewConfirmed() {
        return crewConfirmed;
    }

    public void setCrewConfirmed(String crewConfirmed) {
        this.crewConfirmed = crewConfirmed;
    }

    public String getPushFrequency() {
        return pushFrequency;
    }

    public void setPushFrequency(String pushFrequency) {
        this.pushFrequency = pushFrequency;
    }


    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getXp() {
        return xp;
    }

    public void setXp(String xp) {
        this.xp = xp;
    }

    public String getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(String baseStrength) {
        this.baseStrength = baseStrength;
    }

    public String getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(String baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public String getBaseSkill() {
        return baseSkill;
    }

    public void setBaseSkill(String baseSkill) {
        this.baseSkill = baseSkill;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getEffectiveStrength() {
        return effectiveStrength;
    }

    public void setEffectiveStrength(int effectiveStrength) {
        this.effectiveStrength = effectiveStrength;
    }

    public String getEffectiveSpeed() {
        return effectiveSpeed;
    }

    public void setEffectiveSpeed(String effectiveSpeed) {
        this.effectiveSpeed = effectiveSpeed;
    }

    public String getEffectiveSkill() {
        return effectiveSkill;
    }

    public void setEffectiveSkill(String effectiveSkill) {
        this.effectiveSkill = effectiveSkill;
    }

    public String getInvestigationPoints() {
        return investigationPoints;
    }

    public void setInvestigationPoints(String investigationPoints) {
        this.investigationPoints = investigationPoints;
    }

    public String getCrewID() {
        return crewID;
    }

    public void setCrewID(String crewID) {
        this.crewID = crewID;
    }

    public String getCrewLastChatID() {
        return crewLastChatID;
    }

    public void setCrewLastChatID(String crewLastChatID) {
        this.crewLastChatID = crewLastChatID;
    }

    public String getLastAttackedInnocentCount() {
        return lastAttackedInnocentCount;
    }

    public void setLastAttackedInnocentCount(String lastAttackedInnocentCount) {
        this.lastAttackedInnocentCount = lastAttackedInnocentCount;
    }

    public String getLastAttackedCriminalCount() {
        return lastAttackedCriminalCount;
    }

    public void setLastAttackedCriminalCount(String lastAttackedCriminalCount) {
        this.lastAttackedCriminalCount = lastAttackedCriminalCount;
    }

    public String getHadStfdWarning() {
        return hadStfdWarning;
    }

    public void setHadStfdWarning(String hasStfdWarning) {
        this.hadStfdWarning = hasStfdWarning;
    }

    public String getLastIncentivisedInviteLevel() {
        return lastIncentivisedInviteLevel;
    }

    public void setLastIncentivisedInviteLevel(String lastIncentivisedInviteLevel) {
        this.lastIncentivisedInviteLevel = lastIncentivisedInviteLevel;
    }

    public String getLastBossLevel() {
        return lastBossLevel;
    }

    public void setLastBossLevel(String lastBossLevel) {
        this.lastBossLevel = lastBossLevel;
    }
}
