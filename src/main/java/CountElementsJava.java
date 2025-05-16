import java.util.*;

public class CountElementsJava {
    public static <T> Map<T, Integer> countElements(List<T> list) {
        Map<T, Integer> result = new HashMap<>();
        for (T item : list) {
            result.put(item, result.getOrDefault(item, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(input);
        System.out.println("Java: " + result);
    }
}
