package generics;

public class ParameterizedType {
    public static class Box<T> {
        T value;
        public T getValue() {
            return value;
        }

        public Box(T value) {
          this.value = value;
        }

    }
    
    // public static <T> void getBox(Box<T> box) {
    //     System.out.println(box.getValue());
    // }

    public static void getBox(Box<Number> box) {
        System.out.println(box.getValue());
    }

    public static void main(String[] args) {
        Box<String> box = new Box("String");

        Box<Number> box1 = new Box<>(10);    // OK, box1 can hold any Number (e.g., Integer, Double)
        Box<Integer> box2 = new Box<>(20);   // OK, box2 can only hold Integer
        Box<Double> box3 = new Box<>(30.5);  // OK, box3 can hold any Double or Number

        // Assigning an Integer to a Box<Number> is allowed because Integer is a subclass of Number
        box1 = box2;
    }
}
