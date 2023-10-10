package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
    
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>(); // You can use ArrayList or any other mutable list
        System.out.println(myList);

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
    }
}
