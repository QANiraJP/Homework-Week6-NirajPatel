package practical1;

/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        //float F;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit:  ");
        double f = s.nextDouble();
        double c = (((f - 32) *5) / 9);
        System.out.println(  "Degree celcius" +c);
    }

}
 //f + "Degree fahrenhit="