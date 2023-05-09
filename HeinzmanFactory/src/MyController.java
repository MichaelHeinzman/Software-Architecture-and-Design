// Michael Heinzman
// Assignment 1


public class MyController {
    public static void main(String[] args) {
        ExampleFactory factory = ExampleFactory.getInstance();
        IAService service = factory.getService();
        service.provideService();
    }
}