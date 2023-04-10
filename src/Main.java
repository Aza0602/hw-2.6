import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("Hi", "Fi", "hi", "Ri", "fi", "Fi"));
    }

    private static void task1(List<Integer> numbers) {
        System.out.println("Задание 1");
        for (Integer number: numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> numbers) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer number: set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Задание 3");
        for (String word: words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}