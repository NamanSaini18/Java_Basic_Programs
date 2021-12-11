/*
 final is a modifier in c programming language.
 const int a;
 IN JAVA PROGRAMMING
 const replaced with final
 if you want to impose some restriction use the final modifier
 1) with variable
 2) with method
 3) with class

 instance variable
 (Before constructor completion you have to initialize it explicitly)
 if you are declaring the final variable inside the class
 Final is the only modifier which we can use with the local variables.
 */


class MyClass {
    public int num1;
    public int num2;
    MyClass()
    {
        num1 = 50_000;
        num2 = 1_45_000;
    }

    public void display()
    {

        System.out.println(num1 + " " + num2);
    }

}
public class FINALDEMO {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.display();
        MyClass obj2 = obj1;
        System.out.println(obj1);
        System.out.println(obj2);
        obj2.num1 = 9090;
        obj1.display();
    }
}
