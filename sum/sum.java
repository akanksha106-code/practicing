import java.util.Scanner;

class Solution {
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();                 // Read input number
        isEven(n);                            // Call the method
        sc.close();                           // Close the scanner
        
    }
}
