package generics;

public class Main {;
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Box rawBox = new Box();           // rawBox is a raw type of Box<T>
        Box<Integer> intBox = rawBox;     // warning: unchecked conversion // Error: incompatible types (int cannot be passed to a method expecting String)

        Box<String> stringBox = new Box<>();
        Box rawBox2 = stringBox;               // OK

        Box rawBox3 = stringBox;
        rawBox3.set(8);  // warning: unchecked invocation to set(T)
    }
}
