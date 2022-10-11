package practical1;
/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width and Height :");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        Double a = h*w ; // Area Formula
        System.out.println("Area is:" + a);
        Double p = 2*(h+w);
        System.out.println("Perimeter is :" +p);


    }

}
