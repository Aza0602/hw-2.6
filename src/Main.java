import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
    }

    private static void task1(List<Integer> numbers) {
        System.out.println("Задание 1");
        for (Integer number: numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
    }
}