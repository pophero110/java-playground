package objectlifecycle;

class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized: " + name);
    }
}