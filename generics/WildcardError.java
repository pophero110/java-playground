package generics;

import java.util.List;

public class WildcardError {

    void foo(List<?> i) {
        i.set(0, i.get(0));
    }    

    void foo1(List<?> i) {
        fooHelper(i);
    }

    <T> void foo2(List<T> i) {
        i.set(0, i.get(0));
    }


    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}