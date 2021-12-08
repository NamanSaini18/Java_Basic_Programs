public class Student {
    String name;
    int age;
    String program;
    Student(String n, int a, String p) {
        super();
        name = n;
        age = a;
        program = p;
    }
    void display_student_info() {}
}

class GraduateStudent extends Student {
    double percentage;
    String stream;

    GraduateStudent(String n, int a, String p, double percentage, String stream) {
        super(n, a, p);
        this.percentage = percentage;
        this.stream = stream;
    }
    @Override
    void display_student_info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(percentage);
        System.out.println(stream);
    }
}

class ResearchStudent extends Student {
    String specialization;
    int years_of_experince;

    ResearchStudent(String n, int a, String p, String specialization, int years_of_experince) {
        super(n, a, p);
        this.specialization = specialization;
        this.years_of_experince = years_of_experince;
    }

    @Override
    void display_student_info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
        System.out.println(specialization);
        System.out.println(years_of_experince);
    }
}

class Main {
    public static void main(String[] args) {
        GraduateStudent gstu1 = new GraduateStudent("Satyam", 23, "BSc", 77.5, "CSE");
        GraduateStudent gstu2 = new GraduateStudent("Aayushi", 19, "BSc Hons", 96, "Botany");
        ResearchStudent rstu1 = new ResearchStudent("Divu", 20, "B.Tech", "Data Structures and Algorithms", 1);
        ResearchStudent rstu2 = new ResearchStudent("Sawan", 19, "MBBS", "Dermatology", 0);
        gstu1.display_student_info();
        gstu2.display_student_info();
        rstu1.display_student_info();
        rstu2.display_student_info();
    }
}
