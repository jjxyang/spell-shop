package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/12/2016.
 */
public class Station /*implements Upgradable*/ {
    //private Position;
    private Ingredient ingredient;
    private String name;
    private int price;

    public Station(Ingredient ingred, int price) {
        this.ingredient = ingred;
        this.price = price;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
