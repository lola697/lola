import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class student {
    String name;
    int age;
    double grade;

    public student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years, " + grade + " grade)";
    }
}

public class StudentExample {
    public static void main(String[] args) {
        List<student> students = Arrays.asList(
                new student("John", 20, 85),
                new student("Jane", 22, 92),
                new student("Jack", 20, 78)
        );

        // Бағасы > 80 студенттерді сүзу
        List<student> filteredStudents = students.stream()
                .filter(student -> student.getGrade() > 80)
                .sorted(Comparator.comparing(student::getName))
                .collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);  // Jane, John
    }
}