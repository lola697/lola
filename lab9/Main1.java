class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}

public class Main1 {
    public static void main(String[] args) {
        new student("Ali", 18);
        new student("Aruzhan", 19);
        new student("Dias", 20);

        System.out.println("Students count: " + student.count);
    }
}