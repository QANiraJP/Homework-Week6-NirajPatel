package practical1;

import java.util.Scanner;

public class Practical5 {

        public static void main(String[] args) {
        //  Practical8 obj = new Practical8();

            Scanner ab = new Scanner(System.in);
            System.out.println("Please enter First number");
            int a = ab.nextInt();//syntax
            System.out.println("Please enter Second number");
            int b = ab.nextInt();
            Practical5 obj = new Practical5();
            obj.addition(a,b);
            obj.substraction(a,b);
            multiplication(a,b);
            division(a,b);

        }

        public void addition(int a, int b) {
            System.out.println("Addition of two number is:" + (a + b));

        }

        public void substraction(int a, int b) {
            int x = a - b;
            System.out.println("Substraction of two number is:" + x);
        }

      public static void multiplication(int a, int b) {
            int y = a * b;
            System.out.println("Multiplication of two number is:" + y);

        }

        public static void division(int a, int b) {
            int z = a / b;
            System.out.println("Division  of two number is:" + z);

        }

    }
