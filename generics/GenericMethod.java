package generics;

import java.io.Serializable;
import java.util.ArrayList;

public class GenericMethod {
   public static <K, V> String compare(K key, V value) {
        System.out.println(key);
        System.out.println(value);
        return "string";
   }

   static <T> T pick(T a1, T a2) { return a2; }

   public static void main(String[] args) {
      compare("String", "A"); 

      Serializable s = pick("d", new ArrayList<String>());
   }
}
