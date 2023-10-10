package generics;

public class TypeInference2 {
    public static class MyClass<T> {
        public <X> MyClass(X x) {

        }
    }    
    public static void main(String[] args) {
        var myclass = new MyClass<String>(123);
        MyClass<Integer> myObject = new MyClass<>("");
    }
}
