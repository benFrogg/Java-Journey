// Learn Task:
// How to do simple displays and formating
// Doing calculations using operators
// Learn how to use Scanners 
// Personal learning: Used for loops and if conditions
// This is before learning Arrays

import java.util.Scanner;

public class firstProj {
    // Scanner variable
    private static Scanner input;

    // Variables for dividers, reduce mess
    private static final String HASHLINE = "#######################################################################################";
    private static final String LINE = "----------------------------------------------------------------------------------";
    private static final String EQUALLINE = "===============================================================================";

    private static double calculateGST(double cost)
    {
        double GSTPrice = cost * 0.07;

        return GSTPrice;
    }

    public static void main (String [] args)
    {
        // Call Scanner
        input = new Scanner(System.in);

        // Declare variables
        int fourth = 0;
        double price4th = 0.0;
        int fifth = 0;
        double price5th = 0.0;
        int sixth = 0;
        double price6th = 0.0;
        int sold4th = 0;
        int temp4th = 0;
        int sold5th = 0;
        int temp5th = 0;
        int sold6th = 0;
        int temp6th = 0;
        double total4thSold = 0.0;
        double total5thSold = 0.0;
        double total6thSold = 0.0;
        int balance4th = fourth - sold4th;
        int balance5th = fifth - sold5th;
        int balance6th = sixth - sold6th;

        // Playing around with for loop and if conditions, could be easily done instead
        for (int i = 4; i <= 6; i++)
        {
            System.out.printf("[STAFF] Please enter the quantity for %sth Edition:      ", i);
            int inventory = input.nextInt();
            System.out.printf("[STAFF] Please enter the price for %sth Edition:     ", i);
            double price = input.nextDouble();

            if (i == 4)
            {
                fourth = inventory;
                price4th = price;
            } else if (i == 5)
            {
                fifth = inventory;
                price5th = price;
            } else 
            {
                sixth = inventory;
                price6th = price;
            }
        }

        System.out.println();
        System.out.print(HASHLINE);
        System.out.println();
        System.out.print("\nWelcome to Bobbi Book Store");
        System.out.println("\n   Bobbi's book information");
        System.out.println();

        System.out.printf("4th Edition and unit price:      %s      %.2f", fourth, price4th);
        System.out.printf("\n5th Edition and unit price:      %s      %.2f", fifth, price5th);
        System.out.printf("\n6th Edition and unit price:      %s      %.2f", sixth, price6th);
        System.out.println();
        System.out.println();
        System.out.println(HASHLINE);
        System.out.println();
        System.out.println("Inventory");
        System.out.println();
        System.out.println("Items         Quantity        Earnings($)     Sold    Balance");
        System.out.println(LINE);
        System.out.printf("4th Edition      %s               %.2f         %s         %s", fourth, total4thSold, sold4th, balance4th);
        System.out.printf("\n5th Edition      %s               %.2f         %s         %s", fifth, total5thSold, sold5th, balance5th);
        System.out.printf("\n6th Edition      %s               %.2f         %s         %s", sixth, total6thSold, sold6th, balance6th);
        System.out.println();
        System.out.println();
        System.out.println(HASHLINE);
        System.out.println("\nPlease place your order below");

        // Benefit of using a for loop here can easily manipulate the amount of editions available 
        for (int i = 4; i <= 6; i++)
        {
            System.out.printf("[ORDER] No of %sth Edition: ", i);
            int order = input.nextInt();

            if (i == 4)
            {
                temp4th = order;
            } else if (i == 5)
            {
                temp5th = order;
            } else 
            {
                temp6th = order;
            }
        }

        System.out.println();
        System.out.println(HASHLINE);
        System.out.println();
        System.out.println("Summary of your order");
        System.out.println();
        System.out.println("Items         Quantity        Cost($)     GST(7%)");
        System.out.println(LINE);

        double cost4th = temp4th * price4th;
        double GST4th = calculateGST(cost4th);
        double cost5th = temp5th * price5th;
        double GST5th = calculateGST(cost5th);
        double cost6th = temp6th * price6th;
        double GST6th = calculateGST(cost6th);
        double preGSTCost = cost4th + cost5th + cost6th;
        double totalGST = GST4th + GST5th + GST6th;
        balance4th = fourth - temp4th;
        balance5th = fifth - temp5th;
        balance6th = sixth - temp6th;
        total4thSold += cost4th;
        total5thSold += cost5th;
        total6thSold += cost6th;
        sold4th += temp4th;
        sold5th += temp5th;
        sold6th += temp6th;

        System.out.printf("4th Edition     %s          %.2f      $%.2f", fourth, cost4th, GST4th);
        System.out.printf("\n5th Edition     %s          %.2f      $%.2f", fifth, cost5th, GST5th);
        System.out.printf("\n6th Edition     %s          %.2f      $%.2f\n", sixth, cost6th, GST6th);
        System.out.println(EQUALLINE);
        System.out.printf("Subtotal Cost:    *****     $%.2f      $%.2f", preGSTCost, totalGST);
        System.out.printf("\nTotal Cost:       *****     $%.2f%n", preGSTCost + totalGST);
        
        System.out.println();
        System.out.println(HASHLINE);
        System.out.println();
        System.out.println("Inventory");
        System.out.println();
        System.out.println("Items         Quantity        Earnings($)     Sold    Balance");
        System.out.println(LINE);
        System.out.printf("4th Edition      %s               %.2f         %s         %s", fourth, total4thSold, sold4th, balance4th);
        System.out.printf("\n5th Edition      %s               %.2f         %s         %s", fifth, total5thSold, sold5th, balance5th);
        System.out.printf("\n6th Edition      %s               %.2f         %s         %s", sixth, total6thSold, sold6th, balance6th);
    }
}
