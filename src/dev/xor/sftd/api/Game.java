package dev.xor.sftd.api;

import dev.xor.sftd.api.json.wrappers.Friend;
import dev.xor.sftd.api.json.wrappers.Messages;
import dev.xor.sftd.api.json.wrappers.Player;
import dev.xor.sftd.api.json.wrappers.player.encounter.Encounter;
import dev.xor.sftd.api.methods.sftd.ApiHandler;
import dev.xor.sftd.api.methods.sftd.api.analytics.Launch;
import dev.xor.sftd.api.methods.sftd.api.investigate.Crew;
import dev.xor.sftd.api.methods.sftd.api.sessions.Login;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private Settings settings = new Settings();
    private Player player;
    private Friend[] friends;
    private Messages messages;
    private ApiHandler apiHandler;
    private Encounter currentEvent;
    public Game(){
        apiHandler = new ApiHandler(this);
        String myFBToken = "CAACW9GZByJGEBAMG6MG0kBgqDVZB0NL61fMHHyvMelMpd7ZCZAUyWjp8TBnLfixp5YHSsa1a57xqUjdDH8kHeS7hgU8dLmjZAZBpd46YOZBpuA6NFJFzy6lZAgaSm0S7Vc9iaa0H2l8ku2eb6cHi0ciVK5zkMYe5EE9OCI3zkVAy6ML8ANVZCOGFZCqQDL1Ab2bXXN210ZCZBpUvrSZBwlGN7tlQ2ELy9STHiZBO0J9EuGXgZCESAZDZD";
        apiHandler.handle(new Login(myFBToken));
    }
    public void startGame(){
        apiHandler.handle(new Launch());
        apiHandler.handle(new Crew(2884));
    }
    public static void main(String... args){
        Game game = new Game();
        game.startGame();
        //Login.doLogin("CAACW9GZByJGEBAMG6MG0kBgqDVZB0NL61fMHHyvMelMpd7ZCZAUyWjp8TBnLfixp5YHSsa1a57xqUjdDH8kHeS7hgU8dLmjZAZBpd46YOZBpuA6NFJFzy6lZAgaSm0S7Vc9iaa0H2l8ku2eb6cHi0ciVK5zkMYe5EE9OCI3zkVAy6ML8ANVZCOGFZCqQDL1Ab2bXXN210ZCZBpUvrSZBwlGN7tlQ2ELy9STHiZBO0J9EuGXgZCESAZDZD");
        //TODO: login via fb
    }
    public Settings getSettings() {
        return settings;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Friend[] getFriends() {
        return friends;
    }

    public void setFriends(Friend[] friends) {
        this.friends = friends;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public Encounter getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Encounter currentEvent) {
        this.currentEvent = currentEvent;
    }
}
