import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old, " + grade + " grade)";
    }
}
public class GroupingByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 20, 85),
                new Student("Jane", 22, 92),
                new Student("Jack", 20, 78),
                new Student("Jill", 22, 88),
                new Student("James", 20, 76)
        );

        // Топтау: жас бойынша топтау
        Map<Integer, List<Student>> groupedByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        // Нәтижелерді шығару
        groupedByAge.forEach((age, group) -> {
            System.out.println("Age " + age + ": " + group);
        });
    }
}