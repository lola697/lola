import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        // Consumer қолдану
        printMessage.accept("Hello, world!");  // Message: Hello, world!
    }
}