class university {
    static int studentCount = 0;

    static void addStudent() {
        studentCount++;
    }

    public class Student {
        public Student(String ali, String it) {
        }

        public void display() {
        }
    }
}

public class Main15 {
    public static void main(String[] args) {
        university.addStudent();
        university.addStudent();
        university.addStudent();

        System.out.println("Total students: " + university.studentCount);
    }
}