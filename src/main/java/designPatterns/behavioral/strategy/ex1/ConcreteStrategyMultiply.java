package designPatterns.behavioral.strategy.ex1;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
