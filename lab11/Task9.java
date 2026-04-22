import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Бұрыш (радиан): ");
        double x = sc.nextDouble();

        System.out.println("sin = " + Math.sin(x));
        System.out.println("cos = " + Math.cos(x));
        System.out.println("tan = " + Math.tan(x));
    }
}