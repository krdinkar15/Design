package designPatterns.creational.singleton.extras;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializationSingletonFix implements Serializable{

    // we have to implement the method readResolve() method.

    public static SerializationSingletonFix INSTANCE=new SerializationSingletonFix();
    private SerializationSingletonFix(){}
    protected Object readResolve()
    {
        return INSTANCE;
    }
}
class TestSerializationSingletonFix{
    public static void main(String[] args) {
        try {
            SerializationSingletonFix obj1=SerializationSingletonFix.INSTANCE;
            ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(obj1);
            out.close();

            ObjectInput in=new ObjectInputStream(new FileInputStream("file.text"));
            SerializationSingletonFix obj2=(SerializationSingletonFix) in.readObject();
            in.close();
            System.out.println(obj1.hashCode());
            System.out.println(obj2.hashCode());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
