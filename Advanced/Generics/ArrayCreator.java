package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {

    public static<T> T[] create(int length,T element) {
        Class<?> clazz = element.getClass();
        T[] arr = (T[])Array.newInstance(clazz,length);

        Arrays.fill(arr,element);
        return arr;
    }
}
