package com.learning;

/**
 * PiggyBank class - Digital piggy bank implementation
 * This class represents a digital piggy bank with basic functionality
 * to add money and display current balance
 */
public class PiggyBank {
    
    // Fields
    private String ownerName;  // Name of the piggy bank owner
    private double money;      // Amount of money in the piggy bank
    
    /**
     * Constructor for PiggyBank
     * @param ownerName The name of the piggy bank owner
     */
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;  // New piggy bank starts with 0 money
    }
    
    /**
     * Adds money to the piggy bank
     * @param amount The amount of money to add
     */
    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("Added " + amount + " baht to " + ownerName + "'s piggy bank");
    }
    
    /**
     * Displays the current amount of money in the piggy bank
     */
    public void showMoney() {
        System.out.println(ownerName + "'s piggy bank has " + money + " baht total");
    }
}
