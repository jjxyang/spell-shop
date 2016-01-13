package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/12/2016.
 */
public class Customer {
    //private int queuePosition
    private Potion desiredPotion;
    private String color;
    private String species;
    private boolean isWaiting;
    private int mood;           // values of 3 (happy), 2 (okay), 1 (upset), 0 (mad)

    public Customer(Potion potion, String color, String species) {
        this.desiredPotion = potion;
        this.color = color;
        this.species = species;
        isWaiting = true;
        mood = 3;   // happy mood
    }

    public boolean isWaiting() {
        return isWaiting;
    }

    public Potion getDesiredPotion() {
        return desiredPotion;
    }

    public void serve(Potion potion) {
        // checks whether player served customer the correct potion
        if (potion.equals(desiredPotion)) {
            isWaiting = false;      // customer is going to leave

            // @TODO an effect on business/your store/your reputation
            //  depending on the customer's mood they leave
        }
        else {
            // customer's mood goes down if they are served the wrong potion
            mood--;

            // customer will leave if served improper potion and mood is now 0 (or technically less)
            if (mood <= 0) {
                isWaiting = false;

                // @TODO an effect on your shop/reputation if customer leaves mad
            }
        }
    }
}