import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test {
    @Aot
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Aot {
        String format() default "yyyy-MM-dd";
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Runnable runnable = () -> {
            System.out.println("Hello");
        };
        runnable.run();
        var test = new Test("123");
        test.getName();
    }
}
