import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grape");
        stringList.add("Date");
        stringList.add("Jackfruit);
        stringList.add("Mango");
        stringList.reremoveIf(s -> s.length() < 5);
        stringList.forEach(System.out::println);
  }
}
  