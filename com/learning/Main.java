package com.learning;

/**
 * Main class to test the PiggyBank functionality
 * This class demonstrates how to use the PiggyBank class
 */
public class Main {
    
    /**
     * Main method to run the piggy bank demonstration
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Step 1: Create first piggy bank for "Nong Porjai"
        System.out.println("=== Creating Digital Piggy Bank ===");
        PiggyBank piggyBank1 = new PiggyBank("Nong Porjai");
        
        // Step 2: Check money for the first time (should be 0)
        System.out.println("\n--- First money check ---");
        piggyBank1.showMoney();
        
        // Step 3: Add money to the piggy bank (2-3 times)
        System.out.println("\n--- Adding money to piggy bank ---");
        piggyBank1.addMoney(20.0);  // Add 20 baht
        piggyBank1.addMoney(50.0);  // Add 50 baht
        piggyBank1.addMoney(30.0);  // Add 30 baht
        
        // Step 4: Check money again after adding
        System.out.println("\n--- Money check after adding ---");
        piggyBank1.showMoney();
        
        // Bonus: Create another piggy bank to demonstrate multiple instances
        System.out.println("\n=== Creating Second Piggy Bank ===");
        PiggyBank piggyBank2 = new PiggyBank("Father");
        piggyBank2.addMoney(100.0);
        piggyBank2.addMoney(25.0);
        piggyBank2.showMoney();
        
        System.out.println("\n=== Summary ===");
        System.out.println("Digital piggy bank is working successfully!");
    }
}
