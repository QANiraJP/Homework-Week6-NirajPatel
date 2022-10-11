package practical1;
/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 8
 */

import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter any number:  ");
        int f = s.nextInt();
        int a= f*1;
        System.out.println(f+ "*1=" + a);
        int b= f*2;
        System.out.println(f+ "*2=" + b);
        int c= f*3;
        System.out.println(f+ "*3=" + c);
        int d= f*4;
        System.out.println(f+ "*4=" + d);
        int e= f*5;
        System.out.println(f+ "*5=" + e);
        int z= f*6;
        System.out.println(f+ "*6=" + z);
        int g= f*7;
        System.out.println(f+ "*7=" + g);
        int h= f*8;
        System.out.println(f+ "*8=" + h);
        int i= f*9;
        System.out.println(f+ "*9=" + i);
        int j= f*10;
        System.out.println(f+ "*10=" + j);




    }
}
