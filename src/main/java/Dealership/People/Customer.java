package Dealership.People;

import Dealership.Behaviours.IBuy;

public class Customer extends Person implements IBuy {

    private double wallet;

    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }
}
