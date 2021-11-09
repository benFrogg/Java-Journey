// Learn task:
// How to swap items stored in variables
// Understand how the logic behind swap works
// Combining digits together using String
// I purposely reuse variables so that I don't waste memory (not a safe option but in this case it is okay)

import java.util.Scanner;

public class Basic0002_Swaps
{
    public static void main (String [] args)
    {
        // Declare Scanner function
        Scanner input = new Scanner(System.in);

        // User input 4 integers to be encrypted
        System.out.print("Please enter first n to encrypt:    ");
        int n1 = input.nextInt();

        System.out.printf("Please enter second n to encrypt:   ");
        int n2 = input.nextInt();

        System.out.printf("Please enter third n to encrpyt:    ");
        int n3 = input.nextInt();

        System.out.printf("Please enter fourth n to encrpyt:   ");
        int n4 = input.nextInt();

        // Combine all digits into 1 integer (An alternative could be n1 * 1000, n2 * 100 and sum them together)
        String combinedString = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4);
        int combined = Integer.parseInt(combinedString);

        System.out.printf("%nThe 4 digits integer to be encrypted is:     %04d", combined);

        // Question state, to encrypt, add 7 to each digit and mod the sum by 10
        int e1 = (n1 + 7) % 10;
        int e2 = (n2 + 7) % 10;
        int e3 = (n3 + 7) % 10;
        int e4 = (n4 + 7) % 10;

        // Question state, to encrypt, swap 1st digit with 3rd digit, 2nd with 4th digit
            // When e1 is moved into temp1 we can use e1 and replace with e3 then move e1 to e3
        int temp = e1;
        e1 = e3;
        e3 = temp;

        temp = e2;
        e2 = e4;
        e4 = temp;

        // Combine the numbers together
        String encryptedString = String.valueOf(e1) + String.valueOf(e2) + String.valueOf(e3) + String.valueOf(e4);
        int encrypted = Integer.parseInt(encryptedString);
        System.out.printf("%nEncrypted integer is %04d", encrypted);

        // Now the question need us to decrypt an input
        // Input digits to be decrypted
        System.out.print("\n\nPlease enter first n to decrypt:    ");
        n1 = input.nextInt();

        System.out.printf("Please enter second n to decrypt:   ");
        n2 = input.nextInt();

        System.out.printf("Please enter third n to decrypt:    ");
        n3 = input.nextInt();

        System.out.printf("Please enter fourth n to decrpyt:   ");
        n4 = input.nextInt();

        input.close();

        // Combine the digits together this time we use the altnative method 
        combined = (n1 * 1000) + (n2 * 100) + (n3 * 10) + n4;

        System.out.printf("%nThe 4 digits integer to be encrypted is:     %04d", combined);

        // Question state, to decrpyt, add 3 to each digit and modulus the sum by 10
        int d1 = (n1 + 3) % 10;
        int d2 = (n2 + 3) % 10;
        int d3 = (n3 + 3) % 10;
        int d4 = (n4 + 3) % 10;

        // Question state, to decrypt, swap 1st digit with 3rd digit, 2nd digit with 4th digit
        temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Combining the decrypted values
        combined = (d1 * 1000) + (d2 * 100) + (d3 * 10) + d4;

        System.out.printf("%nDecrypted integer is %04d", combined);
    }
}