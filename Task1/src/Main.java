import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultIntList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            int integer = intList.get(i);
            if (integer > 0 && integer % 2 == 0) {
                if (!resultIntList.contains(integer)) {
                    resultIntList.add(integer);
                }
            }
        }
        Comparator<Integer> comparator = (x, y) -> x.compareTo(y);
        resultIntList.sort(comparator);
        System.out.println(resultIntList);
    }
}
