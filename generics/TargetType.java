package generics;

import java.util.Collections;
import java.util.List;

public class TargetType {

    static void processStringList(List<Number> stringList) {
        System.out.println(stringList.toString());
    }

    public static void main(String[] args) {
        List<String> listOne = Collections.emptyList();
        List<String> listTwo = Collections.<String>emptyList();
        processStringList(Collections.emptyList());
    }
}
