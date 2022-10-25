package Generics;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ListUtils<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
         return get(list, Collections::min);
    }
    public static <T extends Comparable<T>> T getMax(List<T> list) {
        return  get(list, Collections::max);
    }
    public static<T> void ensureNotEmpty(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
    }
    public static <T extends Comparable<T>> T get (List<T> list, Function<List<T>, T> function) {
        ensureNotEmpty(list);
        return function.apply(list);
    }
}
