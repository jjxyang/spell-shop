package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/12/2016.
 *
 * The player's profile
 */
public class Player {
    private Shop shop;
    private Familiar familiar;
    private Stage currentStage;
    private int credits;

    public Player() {
        shop = new Shop();
    }

    public Player(Familiar familiar, Stage stage, int credits) {
        this.familiar = familiar;
        this.currentStage = stage;
        this.credits = credits;
    }

    /**
     * Gets current shop configuration
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * Gets current familiar configuration
     */
    public Familiar getFamiliar() {
        return familiar;
    }

    /**
     * Gets next playable level
     */
    public Stage getCurrentStage() {
        return currentStage;
    }

    /**
     * Gets amount of credits (money) the player has
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Checks whether the given Upgradable item can be bought
     * @param item - item to be bought
     *
    public boolean canBuy(Upgradable item) {
        if (shop.contains(item)) {
            return false;
        }
        if (item.getPrice() > credits) {
            return false;
        }
        // else
        return true;
    }

    /**
     * Buys the desired item
     * @param item - item to be bought
     *
    public void buy(Upgradable item) {
        if (canBuy(item)) {
            credits -= item.getPrice();
            shop.install(item);
        }
    }
/**/
}
