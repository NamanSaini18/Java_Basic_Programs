// This is the package statement code.
package p1;       // Here p1 is the name of our package in which we will store objects and classes.

public class Student {                 // here our class name is Student
    public int roll_no;             // We are making our attributes public bcoz we will access them in another class. By default, we'll be unable to access them in another class.
    public String name;

    public Student(int roll_no, String name) {         // This is the parameterized constructor which we are using here.
        this.roll_no = roll_no;
        this.name = name;
    }
    public void display(){
        System.out.println(roll_no + " " + name);           
    }
}
//  Below is the code for another subclass named TestStudent in which we will access the attributes of our Syudent class.

import p1.Student;          
import java.util.Scanner;

public class TestStudent extends Student{
    public TestStudent(int roll_no, String name) {
        super(roll_no, name);            // Here we are writing super statements because we are accessing the attributes explicitly.
    }

    public static void main(String[] args) {
        Student obj1 = new Student(37, "Naman_Saini");       // This is the object we have made here.
        Scanner s = new Scanner(System.in);
        System.out.println(obj1.roll_no);
        System.out.println(obj1.name);
    }
}

O/P :
   37
   Naman_Saini
