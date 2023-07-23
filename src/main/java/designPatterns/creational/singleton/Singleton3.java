package designPatterns.creational.singleton;

public class Singleton3 {
    private static Singleton3 obj=null;
    String message;

    public Singleton3() {
    }

    //Only one thread can execute this at a time
    public static synchronized  Singleton3 getInstance()
    {
        if(obj==null)
        {
            System.out.println("Lazy initialization");
            obj=new Singleton3();
        }
        return  obj;
        //The main disadvantage of this is method is that using synchronized
        // every time while creating the singleton object is expensive
        // and may decrease the performance of your program.

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class Test3
{
    public static void main(String[] args) {
        Singleton3 obj1=Singleton3.getInstance();
        obj1.setMessage("first");

        Singleton3 obj2=Singleton3.getInstance();
        System.out.println(obj2.getMessage());

    }
}
