package practical1;

import java.util.Scanner;

/*
8. Write a program to calculate the area of a triangle.
(height*base)/2
 */
public class Practical8 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the height of triangle:");
        int h = s.nextInt();
        System.out.println("Enter the base value of triangle:");
        int b = s.nextInt();
        float a = ((h*b)/2);
        System.out.println("Area of a traingle is :" +a);

    }

}
