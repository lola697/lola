import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Сан енгіз: ");
            double x = sc.nextDouble();
            System.out.println("Сан: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізу керек!");
        }
    }
}