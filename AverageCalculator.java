import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.5);
        doubleList.add(7.2);
        doubleList.add(3.8);
        doubleList.add(10.1);
        doubleList.add(2.4);
        double average = doubleList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);
    }
}
