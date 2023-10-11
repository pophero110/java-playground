package variables;

import java.util.Arrays;

public class Clazz {
    private String stirng;
    private int i;
    private double d;
    private boolean bool;
    private char c;
    private short s;
    private long l;
    private float f;
    private byte b;
    private Object[] arr = new Object[10];

    @Override
    public String toString() {
        arr[0] = i;
        arr[1] = d;
        arr[2] = l;
        arr[3] = f;
        arr[4] = c;
        arr[5] = bool;
        arr[6] = b;
        arr[7] = s;
        
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        var clazz = new Clazz();
        System.out.println(clazz.toString());
    }
    
}
