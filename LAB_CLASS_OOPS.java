class MyClass {             // HERE we are using Myclass as an constructor here.
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
public class FINALDEMO {                                   // This is our main program from where the execution of our program starts.
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.display();
        MyClass obj2 = obj1;                                  
        System.out.println(obj1);
        System.out.println(obj2);
        obj2.num1 = 9090;
        obj1.display();
    }
O/P WILL BE:  
  50000 145000
MyClass@7cca494b
MyClass@7cca494b
9090 145000
