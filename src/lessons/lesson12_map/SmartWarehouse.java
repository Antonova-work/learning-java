package lessons.lesson12_map;

import java.util.HashMap;
import java.util.Scanner;

public class SmartWarehouse {
    public static void main(String[] args) {
        HashMap<String, Integer> storage = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        storage.put("Яблоки", 30);
        storage.put("Груши", 50);

        System.out.println("Введите наименование товара:");
        String itemName = scanner.nextLine();
        if (storage.containsKey(itemName)) {
            System.out.println("Количество на складе: " + storage.get(itemName));
        } else {
            System.out.println("Нет такого товара на складе.");
        }
    }
}
