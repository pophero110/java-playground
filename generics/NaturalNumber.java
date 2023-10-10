package generics;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {
    private int i;
    public NaturalNumber(int i) { this.i = i; }

    static class EvenNumber extends NaturalNumber {
        public EvenNumber(int i) { super(i); }
    }

    void foo(List<? extends Number> nums) {
        Number number = nums.get(0); 
        Object number1 = nums.get(0); // superclass reference also works.
        Double number2 = nums.get(0);
     }

     void foo1(List<? extends Number> nums) {
        nums.add(1); Compile error
        nums.add(1L); Compile error
        nums.add(null); // only null is allowed.
     }

     void foo2(List<? super Number> nums) {
        nums.add(1); // Integer is a subclass of Number
        nums.add(1L); // Long is a subclass of Number
    }

    void foo4(List<? super Number> nums) {
        Object ele = nums.get(0);
        nums.set(0, ele); // Integer is a subclass of Number
    }
    
    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
        var element = ln.get(0);
        List<? extends Number> readOnlyList = new ArrayList<>();
        readOnlyList.add(1, 12);
        ln.add(new EvenNumber(1));
        ln.add(new NaturalNumber(35));  // compile-time error 
        ArrayList<? extends Number> arr = new ArrayList<>;
        arr.add(1);
    }
}
