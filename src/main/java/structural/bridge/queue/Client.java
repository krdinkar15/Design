package structural.bridge.queue;

public class Client {
    public static void main(String[] args) {
        FifoCollection<Integer> collection=new Queue<>(new SinglyLinkedList<>());
        collection.add(10);
        collection.add(20);
        collection.add(30);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

    }
}
