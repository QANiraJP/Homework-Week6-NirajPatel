package practical1;

import java.util.Scanner;

/*
Write a Java program to swap two variables.
x=a
a=b
b=x

 */
public class Practical15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number a:");
        int a = sc.nextInt();
        System.out.println("Enter second number b:");
        int b= sc.nextInt();
        int c;
        c=a;// C WILL TAKE A'S VALUE
        a=b;
        b=c;
        System.out.println("Swapped values are:" + " a:" +a+ " b:" +b);


    }




}
