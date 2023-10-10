package generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public final class Algorithm {
        public static <T extends Comparable> T max(T x, T y) {
            return x.compareTo(y) > 0 ? x : y;
        }
    }

    public static <T> T swapElement(T[] intArr) {
        var first = intArr[0];
        var second = intArr[1];
        intArr[0] = second;
        intArr[0] = first;
        return intArr[1];
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(Algorithm.max(3, 2));

        Integer[] intArr = {1,2,3};
        System.out.println(swapElement(intArr));

        print(List.of(1,2,3));
    }
    
}
