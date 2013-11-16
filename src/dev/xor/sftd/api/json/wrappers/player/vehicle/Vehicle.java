package dev.xor.sftd.api.json.wrappers.player.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {
    private String name;
    public Vehicle(String id){
        //TODO: load json from string name and parse into vehicle
        this.name = id;
    }
    public String toString(){
        return name;
    }
}
