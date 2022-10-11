package practical1;

import java.util.Scanner;

public class Practical9 {
        public static void main(String[] args) {
            String upCase;
            Scanner sc = new Scanner(System.in);
            sc = new Scanner(System.in);
            System.out.print("Enter UpperCase String ");
            upCase = sc.nextLine();
            String loCase = upCase.toLowerCase();
            System.out.println("Converts to LowerCase String " + loCase);
            sc.close();
        }
}
/*
STRING TXT = "";
sout(txt.toUpperCase());
sout(txt.toLowerCase());
 */
