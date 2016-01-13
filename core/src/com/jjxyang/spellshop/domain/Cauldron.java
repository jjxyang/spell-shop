package com.jjxyang.spellshop.domain;

import java.util.ArrayList;

/**
 * Created by Jessie on 1/12/2016.
 */
public class Cauldron {
    private boolean hasIngreds;
    private boolean isFinished;
    private ArrayList<Ingredient> currIngreds;
    //private Position position??

    public Cauldron() {
        isFinished = false;
        currIngreds = new ArrayList<Ingredient>();
    }

    public Cauldron(Ingredient firstIngred) {
        isFinished = false;

        currIngreds = new ArrayList<Ingredient>();
        currIngreds.add(firstIngred);
    }

    /**
     * Checks whether current # of ingredients inside cauldron is greater than 0 or not
     */
    public boolean hasIngreds() {
        return currIngreds.size() != 0;
    }

    /**
     * Checks whether the cauldron's current potion has been finished or not
     * @TODO figure out how to check if potion is done
     */
    public boolean isFinished() {
        return isFinished;
    }
    /**
     * Sets whether the cauldron is finished cooking
     */
    public void setFinished(boolean state) {
        isFinished = state;
    }

    /**
     * Gets ingredients currently in the cauldron
     */
    public ArrayList<Ingredient> getCurrIngreds() {
        return currIngreds;
    }
}
