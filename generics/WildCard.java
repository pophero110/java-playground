package generics;

import java.util.List;

import stream.StreamCreation.Foo;

public class WildCard<T> {
    public static void process(List<? extends Number> list) { /* ... */ }
    public static <T extends Foo> void process(List<T> list) { /* ... */ }

    public static void main(String[] args) {
        process(List.of(1.0f));
    }
    
}
