package practical1;
/*
Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.

 */
public class Practical19 {
    public static void main(String[] args) {
        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", b;
        b = s.toLowerCase();
        System.out.println("Converted to LowerCase String: " + b);
    }
}
