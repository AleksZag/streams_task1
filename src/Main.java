import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredIntList = new ArrayList<>();

        for (int number : intList) {
            if (number > 0 && number % 2 == 0) {
                filteredIntList.add(number);
            }
        }
        filteredIntList.sort(Comparator.naturalOrder());
        System.out.println(filteredIntList);

    }
}
