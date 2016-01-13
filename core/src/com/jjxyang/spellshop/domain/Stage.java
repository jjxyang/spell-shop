package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/12/2016.
 *
 * A playable stage
 */
public class Stage {
    private String name;

    public Stage(String name) {
        this.name = name;
    }

    /**
     * Gets level name
     */
    public String getName() {
        return name;
    }
}
