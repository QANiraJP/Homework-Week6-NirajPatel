package practical1;

/*3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Practical3 {
    // 3.1
    int a=10; //instance variable
    static int b=20; // static variable
    //3.5 , 3.6
    public static void main(String[] args) {
        Practical3 obj= new Practical3();
        obj.meth1();
        meth2();
    }
    //3.2,3.4
    public void meth1(){  //instance method

        System.out.println(a);
        System.out.println(b);
    }
    //3.3,3.4
    public static void meth2(){ //static method
        Practical3 obj2 = new Practical3();
        System.out.println(obj2.a);
        System.out.println(b);
    }
}
