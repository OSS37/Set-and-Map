import java.util.*;
import java.util.Arrays;


public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 5, 6, 7));
    private static List<String> words = new ArrayList<>(List.of("мандарин", "виноград", "слива", "мандарин", "яблоко", "банан", "виноград", "айва", "яблоко"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    //Метод, который выводит только нечетные числа в консоль
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    //Метод, который выводит только четные числа без повторений в порядке возрастания.
    public static void task2() {
        System.out.println("Задача 2");
        Set<Integer> numsSet = new HashSet<>(nums); // объявление сета
        ArrayList<Integer> num = new ArrayList<>(numsSet); // преобразование сета в лист (для избежания повторов)
        Collections.sort(num); // сортировка листа по возрастанию
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                System.out.print(num.get(i) + " ");
            }
        }
        System.out.println();
    }

    //Метод, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли
    public static void task3() {
        System.out.println("Задача 3");
        Set<String> setWords = new HashSet<>(words);
        System.out.println(setWords);
    }

    //Метод, который выводит в консоль все количество дублей из списка слов
    public static void task4() {
        System.out.println("Задача 4");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}