import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int id;
    double amount;

    public Order(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + ", Amount: " + amount;
    }
}


public class OrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, 100.50),
                new Order(2, 200.75),
                new Order(3, 150.00),
                new Order(4, 75.20),
                new Order(5, 50.60)
        );

        // Барлық тапсырыстардың жалпы сомасын есептеу
        double totalAmount = orders.stream()
                .mapToDouble(Order::getAmount)  // Сомаға түрлендіру
                .sum();  // Қосынды

        System.out.println("Барлық тапсырыстардың жалпы сомасы: " + totalAmount);  // 577.05

        // Сомасы 100-ден асатын тапсырыстарды сүзу
        List<Order> highValueOrders = orders.stream()
                .filter(order -> order.getAmount() > 100)
                .collect(Collectors.toList());

        System.out.println("Сомасы 100-ден асатын тапсырыстар:");
        highValueOrders.forEach(System.out::println);  // Order ID: 2, Amount: 200.75, Order ID: 3, Amount: 150.0
    }
}
