import java.util.ArrayList;
import java.util.HashSet;

public class DistinctValues {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 4, 2, 3, 1, 6, 4};

        // Using HashSet to store distinct values
        HashSet<Integer> distinctSet = new HashSet<>();
        
        for (int value : inputArray) {
            distinctSet.add(value);
        }

        // Converting HashSet to ArrayList for printing
        ArrayList<Integer> distinctList = new ArrayList<>(distinctSet);

        // Printing distinct values
        System.out.print("[");
        for (int i = 0; i < distinctList.size(); i++) {
            System.out.print(distinctList.get(i));
            if (i < distinctList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}