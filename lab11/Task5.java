import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 – Қосу");
        System.out.println("2 – Азайту");
        System.out.println("3 – Көбейту");
        System.out.println("4 – Бөлу");

        int choice = sc.nextInt();

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("0-ге бөлуге болмайды");
                break;
            default: System.out.println("Қате таңдау");
        }
    }
}