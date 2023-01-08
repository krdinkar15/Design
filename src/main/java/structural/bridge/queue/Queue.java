package structural.bridge.queue;
//A refined abstraction
public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> list;


    public Queue(LinkedList<T> list)
    {
        this.list=list;
    }
    @Override
    public void add(T elememt) {
        list.addLast(elememt);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
