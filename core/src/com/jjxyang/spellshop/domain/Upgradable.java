package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/13/2016.
 *
 * A feature of the game/shop that can be upgraded,
 *     e.g. one can upgrade and get more Stations, Cauldrons, etc.
 */

/**
 * @TODO Upgrade system for player and their shop and familiar, etc.
 */
public interface Upgradable {
    /**
     * Gets name of item
     */
    String getName();

    /**
     * Gets price to acquire this item or MORE of this item
     */
    int getPrice();
}
