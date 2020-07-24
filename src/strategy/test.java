package strategy;
//策略模式
public class test {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMult());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

