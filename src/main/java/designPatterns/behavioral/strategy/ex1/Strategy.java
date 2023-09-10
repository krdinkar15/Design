package designPatterns.behavioral.strategy.ex1;
// The strategy Interface declares operations common to all supported version of some algorithms.
// The context uses this to call the algorithm defined by the concrete strategies.
public interface Strategy {
    int execute(int a, int b);
}
