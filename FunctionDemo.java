class calculator {
    // Function Overloading

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Class demonstrating constructors and returning by reference
class student {
    String name;
    int age;

    // Default constructor
    student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    student(student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    // Method returning reference to current object
    student getStudent() {
        return this;
    }
}

// Main class
public class FunctionDemo {

    public static void main(String[] args) {

        calculator calc = new calculator();

        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 4.5));

        student s1 = new student();

        student s2 = new student("Nitin", 22);

        student s3 = new student(s2);

        student s4 = s2.getStudent();

        System.out.println("Student s1 details:");
        s1.display();

        System.out.println("Student s2 details:");
        s2.display();

        System.out.println("Student s3 details (copy of s2):");
        s3.display();

        System.out.println("Student s4 details (reference to s2):");
        s4.display();
    }
}
