package com.jjxyang.spellshop.domain;

/**
 * Created by Jessie on 1/13/2016.
 *
 * The player's shop
 * Contains Cauldrons, Stations, queue of Customers
 */
public class Shop {
    private Cauldron[] cauldrons = new Cauldron[3];
    private Station[] stations = new Station[5];
    private Customer[] customerQueue = new Customer[6];

    /*
     * Constructor that intializes 1 Cauldron, 1 Station, and 1 Customer
     * All other elements in respective arrays are null
     */
    public Shop() {
        cauldrons[0] = new Cauldron();
        stations[0] = new Station();
        customerQueue[0] = new Customer();
    }

    public Cauldron[] getCauldrons() {
        return cauldrons;
    }

    public Station[] getStations() {
        return stations;
    }

    public Customer[] getCustomerQueue() {
        return customerQueue;
    }


    /**
     * Checks if shop contains the given item
     * @param item - item to be installed
     *
    public boolean contains(Upgradable item) {
        if (item == null)
            return false;
        // else
        return true;
    }

    /**
     * Installs the desired item in the shop
     * Does not verify credits
     * @param item - item to be installed
     *
    public void install(Upgradable item) {

    }
/**/
}
