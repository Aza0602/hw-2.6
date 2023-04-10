import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
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
}