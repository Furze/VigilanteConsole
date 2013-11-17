package dev.xor.sftd.api.methods.sftd.misc;

public class MathHelpers {
    public static int random(int low, int high){
        return (int)((Math.random()*high)+low);
    }
}
