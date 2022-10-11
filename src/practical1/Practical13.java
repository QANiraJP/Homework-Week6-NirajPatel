package practical1;

import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers
 */
public class Practical13 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
            System.out.println("Enter Three Numbers:  ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        float d =((a+b+c) /3);
       System.out.println("Average value is:" +d);


    }
}
