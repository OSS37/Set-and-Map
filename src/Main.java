import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        Set<Integer> numsSet = new HashSet<>(List.of(1, 4, 3, 5, 8, 3, 6, 2, 7, 2, 8)); // объявление сета
        ArrayList<Integer> num = new ArrayList<>(numsSet); // преобразование сета в лист (для избежания повторов)
        Collections.sort(num); // сортировка листа по возрастанию
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 != 0) {
                System.out.print(num.get(i) + " ");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<String> nums = new ArrayList<>(List.of("мандарин", "виноград", "слива", "мандарин", "яблоко", "банан", "виноград", "айва"));


    }
}