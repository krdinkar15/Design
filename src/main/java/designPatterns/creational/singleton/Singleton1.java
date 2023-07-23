package designPatterns.creational.singleton;


public class Singleton1 {
    private static Singleton1 obj=new Singleton1();  //Eager Instantiation
    String message;
    private Singleton1() {
    }
    public static Singleton1 getInstance()
    {
        return obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class Test1
{
    public static void main(String[] args) {
        Singleton1 obj1=Singleton1.getInstance();
        obj1.setMessage("first initialization");

        Singleton1 obj2=Singleton1.getInstance();
        System.out.println(obj2.getMessage()); // first initialization
    }
}
