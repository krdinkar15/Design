package designPatterns.creational.singleton;

public class Singleton2 {
    private static Singleton2 obj=null;
    String message;
    private Singleton2() {
    }
    public static Singleton2 getInstance()
    {

        // Singleton obj is not created until we need it and call getInstance() method.
        // This is called lazy instantiation.
        if(obj==null)
        {
            System.out.println("creating object of Singleton2 Class :  lazy instantiation ");
            obj=new Singleton2();
        }
        return  obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class Test2
{
    public static void main(String[] args) {
        Singleton2 singleton2=Singleton2.getInstance();

        singleton2.setMessage("first");

        singleton2=Singleton2.getInstance();
        System.out.println(singleton2.getMessage());

    }
}
