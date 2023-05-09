

// ExampleFactory.java
public class ExampleFactory {
    private static ExampleFactory instance;

    private ExampleFactory() {
    }

    public static ExampleFactory getInstance() {
        if (instance == null) {
            instance = new ExampleFactory();
        }
        return instance;
    }

    public IAService getService() {
        return new AService();
    }
}