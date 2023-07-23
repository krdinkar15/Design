package designPatterns.structural.bridge.queue;
/*
    This is abstraction
    It represents a First in First Out collection
 */
public interface FifoCollection<T> {

    // Add element to collection
    void add(T elememt);
    // Removes and  returns the first element from collection
    T poll();

}
