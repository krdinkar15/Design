package designPatterns.behavioral.strategy.ex1;
// The context defines the interface of interest to clients.
public class Context {
    private Strategy strategy;
    // The context  maintains a reference to one of the strategy objects.
    // The context doesn't know the concrete class of a strategy.
    // It should work with all the strategies via the strategy interface.


    // The context accepts the strategy  through the constructor and also
    // provided a setter so that the strategy can be switched at runtime.
    public void setStrategy(Strategy strategy)
    {
        this.strategy=strategy;
    }




    // The context delegates some work to the strategy object instead of
    // implementing multiple versions of algorithms on its own.
    int executeStrategy(int a, int b)
    {
        return strategy.execute(a,b);
    }



}
