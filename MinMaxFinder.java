import java.util.ArrayList;
import java.util.List;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(15);
        numbers.add(3);
        Integer max = numbers.stream().max(Integer::compareTo).orElse(0);
        Integer min = numbers.stream().min(Integer::compareTo).orElse(0);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
