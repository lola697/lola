import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // flatMap арқылы ішкі тізімдерді біріктіру
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)  // Ішкі тізімдерді ашу
                .collect(Collectors.toList());

        flattenedList.forEach(System.out::println);  // 1, 2, 3, 4, 5, 6, 7, 8, 9
    }
}