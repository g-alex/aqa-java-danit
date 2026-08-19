package hw_11.task1;

public class MyBrowser implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("Browser closed");
    }
}
