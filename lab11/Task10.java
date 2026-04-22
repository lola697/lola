import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (мысалы: 2+3*4): ");
        String expr = sc.next();

        int result = 0;

        if (expr.contains("+")) {
            String[] parts = expr.split("\\+");
            result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        } else if (expr.contains("-")) {
            String[] parts = expr.split("-");
            result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*");
            result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
        } else if (expr.contains("/")) {
            String[] parts = expr.split("/");
            result = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
        }

        System.out.println("Нәтиже: " + result);
    }
}
