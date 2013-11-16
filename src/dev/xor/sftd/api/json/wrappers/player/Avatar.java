package dev.xor.sftd.api.json.wrappers.player;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Avatar {
    private int mouth;
    private String gender;
    private int head;
    private int eyes;
    private String mask;

    public Avatar(int mouth, String gender, int head, int eyes, String mask) {
        this.mouth = mouth;
        this.gender = gender;
        this.head = head;
        this.eyes = eyes;
        this.mask = mask;
    }

    public int getMouth() {
        return mouth;
    }

    public String getGender() {
        return gender;
    }

    public int getHead() {
        return head;
    }

    public int getEyes() {
        return eyes;
    }

    public String getMask() {
        return mask;
    }
}
