package designPatterns.behavioral.strategy.ex1;

public class ClassExample {
    public static void main(String[] args) {
        Context context=new Context();
        int a=12;
        int b=9;

        context.setStrategy(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(a,b));


        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println(context.executeStrategy(a,b));


        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(a,b));
    }
}
