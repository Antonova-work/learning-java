package lessons.lesson12_map;

import java.util.HashMap;
import java.util.Scanner;

public class OrderDatabase {
    public static void main(String[] args) {
        HashMap<Integer, Order> database = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        database.put(1, new Order("Пицца", "Готовится"));
        database.put(2, new Order("Кофе", "Доставлен"));

        System.out.println("Введите id заказа:");
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректный id заказа:");
            }
        }
        if (database.containsKey(id)) {
            System.out.println(database.get(id));
        } else {
            System.out.println("Нет такого заказа.");
        }
    }
}

class Order {
    String name;
    String status;

    public Order (String newName, String newStatus) {
        this.name = newName;
        this.status = newStatus;
    }

    public String toString () {
        return "Заказ: " + name + " | Статус: " + status;
    }
}