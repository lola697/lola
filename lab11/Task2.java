import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгіз: ");
        double x = sc.nextDouble();

        if (x >= 0)
            System.out.println("√x = " + Math.sqrt(x));
        else
            System.out.println("Теріс саннан түбір алынбайды!");
    }
}