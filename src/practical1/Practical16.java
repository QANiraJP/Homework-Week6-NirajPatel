package practical1;

import java.util.Scanner;

public class Practical16 {
    public static void main(String[] args) {
        String b1, b2;
        int x, y, z;
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number 1: ");
        b1 = sc.nextLine();
        System.out.print("Enter Binary number 2: ");
        b2 = sc.nextLine();
        x = Integer.parseInt(b1, 2);
        y = Integer.parseInt(b2, 2);
        z = x + y;
        System.out.println("Sum of two Binary numbers is: " + Integer.toBinaryString(z));
        sc.close();
    }
}
