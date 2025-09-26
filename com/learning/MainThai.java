package com.learning;

/**
 * Main class to test the PiggyBankThai functionality
 * This class demonstrates how to use the PiggyBankThai class
 */
public class MainThai {
    
    /**
     * Main method to run the piggy bank demonstration
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Step 1: Create first piggy bank for "น้องพอใจ"
        System.out.println("=== สร้างกระปุกออมสินดิจิทัล ===");
        PiggyBankThai piggyBank1 = new PiggyBankThai("น้องพอใจ");
        
        // Step 2: Check money for the first time (should be 0)
        System.out.println("\n--- ดูเงินครั้งแรก ---");
        piggyBank1.showMoney();
        
        // Step 3: Add money to the piggy bank (2-3 times)
        System.out.println("\n--- หยอดเงินใส่กระปุก ---");
        piggyBank1.addMoney(20.0);  // Add 20 baht
        piggyBank1.addMoney(50.0);  // Add 50 baht
        piggyBank1.addMoney(30.0);  // Add 30 baht
        
        // Step 4: Check money again after adding
        System.out.println("\n--- ดูเงินอีกครั้งหลังหยอดเงิน ---");
        piggyBank1.showMoney();
        
        // Bonus: Create another piggy bank to demonstrate multiple instances
        System.out.println("\n=== สร้างกระปุกใบที่สอง ===");
        PiggyBankThai piggyBank2 = new PiggyBankThai("คุณพ่อ");
        piggyBank2.addMoney(100.0);
        piggyBank2.addMoney(25.0);
        piggyBank2.showMoney();
        
        System.out.println("\n=== สรุปผลลัพธ์ ===");
        System.out.println("กระปุกออมสินดิจิทัลทำงานได้สำเร็จ!");
    }
}
