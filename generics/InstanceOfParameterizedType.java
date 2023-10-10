package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InstanceOfParameterizedType {


    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        E ele2 = (E) "12";
        list.add(elem);
        list.add(ele2);
    }

    public static <E> void rtti(List<E> list) {
        if (list instanceof ArrayList<Integer>) {  // compile-time error
            // ...
        }
    }

    public static void rtti2(List<?> list) {
        if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
            // ...
        }
    }

    public void print(Set<String> strSet) { }
    public void print(Set<Integer> intSet) { }

    public static void main(String[] args) throws Exception {
        List<String> ls = new ArrayList<>();
        ls.add("2");
        append(ls, String.class);
        System.out.println(ls);
        List<Integer> li = new ArrayList<>();
        List<Number>  ln = (List<Number>) li;  // compile-time error
        Object[] stringLists = new List<String>[2];  // compiler error, but pretend it's allowed
        stringLists[0] = new ArrayList<String>();   // OK
        stringLists[1] = new ArrayList<Integer>();
    }
    
}
