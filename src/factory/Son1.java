package factory;

public class Son1 implements fatherFactory {
    @Override
    public void eat() {
        System.out.println("i'm eat apple");
    }
}
