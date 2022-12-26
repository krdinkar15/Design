package creational.singleton;


public class Singleton4 {
    private static volatile Singleton4 obj=null;
    private String message;
    private Singleton4(){}
    public static Singleton4 getInstance()
    {
        if(obj==null)
        {
            synchronized (Singleton4.class)
            {
                if(obj==null)
                {
                    obj=new Singleton4();
                }
            }
        }
        return obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class Test4
{
    public static void main(String[] args) {
        Singleton4 obj1=Singleton4.getInstance();
        obj1.setMessage("first");
        Singleton4 obj2=Singleton4.getInstance();
        System.out.println(obj2.getMessage());
    }
}

