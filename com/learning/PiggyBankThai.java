package com.learning;

/**
 * PiggyBank class - Digital piggy bank implementation (Thai version)
 * This class represents a digital piggy bank with basic functionality
 * to add money and display current balance
 */
public class PiggyBankThai {
    
    // Fields
    private String ownerName;  // Name of the piggy bank owner
    private double money;      // Amount of money in the piggy bank
    
    /**
     * Constructor for PiggyBankThai
     * @param ownerName The name of the piggy bank owner
     */
    public PiggyBankThai(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;  // New piggy bank starts with 0 money
    }
    
    /**
     * Adds money to the piggy bank
     * @param amount The amount of money to add
     */
    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("หยอดเงินใส่กระปุกของ " + ownerName + " จำนวน " + amount + " บาท");
    }
    
    /**
     * Displays the current amount of money in the piggy bank
     */
    public void showMoney() {
        System.out.println("กระปุกของ " + ownerName + " มีเงินทั้งหมด " + money + " บาท");
    }
}
