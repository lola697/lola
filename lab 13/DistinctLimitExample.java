import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7);

        // Қайталануларды жою және алғашқы 5 элементті алу
        numbers.stream()
                .distinct()  // Қайталануларды жою
                .limit(5)    // Алғашқы 5 элементті алу
                .forEach(System.out::println);  // 1, 2, 3, 4, 5
    }
}