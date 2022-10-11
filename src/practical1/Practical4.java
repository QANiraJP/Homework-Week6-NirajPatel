package practical1;
/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme */

public class Practical4 {
    //4.1
    int a=10;
    int b=20;
    static int c=30;
    static int d=40;

    public static void main(String[] args) {//4.4
        //4.5
        met2();
        Practical4 obj =new Practical4();
        obj.met1();

    }
    //4.2
    public void met1(){
        //4.4
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    //4.3
    public static void met2(){
        //4.4
        Practical4 obj2 = new Practical4();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(c);
        System.out.println(d);
    }

}
