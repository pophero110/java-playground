package generics;

public class Box<T> {
    T value;
    public void set(T t) { this.value = t; }
    public T get() { return value ; }
}
