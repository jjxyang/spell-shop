package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/12/2016.
 */
public class Familiar {
    private Ingredient heldIngred;
    private int speed;
    private String type;
    //private Position position;

    /**
     * Constructor
     * (by default, the familiar holds no ingredient)
     * @param speed - how fast the familiar will move
     * @param type - what type of familiar it is (e.g. cat, spider, frog, etc)
     */
    public Familiar(int speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public Ingredient getHeldIngred() {
        return heldIngred;
    }

    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public void setHeldIngred(Ingredient heldIngred) {
        this.heldIngred = heldIngred;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }
}
