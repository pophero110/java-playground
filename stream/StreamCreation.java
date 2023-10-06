package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamCreation {

    @FunctionalInterface
    public interface Foo {
        String method(String string);
    }

    public static String add(String string, Foo foo) {
        return foo.method(string);
    }

    public static void main(String[] args) {
        Foo foo = parameter -> parameter + " from lambda";
        System.out.println(foo.method("123"));
        String result = add("Message ", foo);
        System.out.println(result);
    } 
}
