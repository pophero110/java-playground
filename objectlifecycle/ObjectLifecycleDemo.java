package objectlifecycle;

public class ObjectLifecycleDemo {
    public static void main(String[] args) {
        // Create an object and reference it
        MyObject obj1 = new MyObject("Object 1");

        // Create more objects and reference them
        MyObject obj2 = new MyObject("Object 2");
        MyObject obj3 = new MyObject("Object 3");

        // Set obj2 and obj3 to null to dereference them
        obj2 = null;
        obj3 = null;

        // Suggest garbage collection (optional)
        // System.gc();

        // Create a new object and reference it
        MyObject obj4 = new MyObject("Object 4");

        // At this point, obj1 and obj4 are the only references

        // Demonstrate garbage collection by running low memory conditions
        allocateLotsOfMemory();

        // obj1 may be garbage collected if memory is low
        System.out.println("End of program");
    }

    private static void allocateLotsOfMemory() {
        // Allocate a large amount of memory to increase the likelihood of garbage collection
        for (int i = 0; i < 100000; i++) {
            byte[] buffer = new byte[1024]; // Allocate 1 KB of memory repeatedly
        }
    }
}

