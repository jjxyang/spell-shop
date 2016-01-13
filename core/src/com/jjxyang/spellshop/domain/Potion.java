package com.jjxyang.spellshop.domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jessie on 1/12/2016.
 */
public class Potion {
    private ArrayList<Ingredient> recipe;

    /**
     * Constructor that takes in an array of ingrdients and converts it into an ArrayList
     * @param recipe - ArrayList of ingredients needed to make potion
     */
    public Potion(Ingredient[] recipe) {
        this.recipe = new ArrayList<Ingredient>(Arrays.asList(recipe));
    }

    public ArrayList<Ingredient> getRecipe() {
        return recipe;
    }

    //@Override
    /**
     * @TODO
     *
    public boolean equals(Object obj) {
        Potion other = (Potion) obj;

        // if recipe lengths differ, are not the same potion
        if (other.getRecipe().size() != recipe.size()) {
            return false;
        }

        for (int i = 0; i < recipe.size(); i++) {
            // sorts Ingredients alphabetically by name

            // if ingredient in one recipe is not equal to that of another recipe,
            //      return false
            if (!other.getRecipe().get(i).equals(recipe.get(i))) {
                return false;
            }
        }
        // else
        return true;
    }
/**/
}// end of Potion
