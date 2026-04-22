import java.util.Arrays;
import java.util.List;

public class ReduceSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Сандардың қосындысын табу
        int sum = numbers.stream()
                .reduce(0, Integer::sum);  // 0 бастапқы мән, Integer::sum қосу операциясы

        System.out.println("Қосынды: " + sum);  // 15
    }
}