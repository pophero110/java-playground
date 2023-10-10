package generics;

import java.util.Collection;

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

class Node<T> implements Comparable<T> {

    private static T value;
    
    public int compareTo(T obj) {
        return 0; /* ... */ }

    public static void main(String[] args) {
        Node<Circle> nc = new Node<>();
        Node<Circle>  ns = nc;

        Node<String> node = new Node<>();
        Comparable<String> comp = node;
    }
}
