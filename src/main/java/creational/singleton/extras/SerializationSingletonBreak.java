package creational.singleton.extras;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSingletonBreak implements Serializable {
    //Serialization is used to convert an object of a byte stream and save in a file or send it over a network.
    // Suppose you serialize an object of a singleton class. Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.

    public static SerializationSingletonBreak INSTANCE=new SerializationSingletonBreak();
    private SerializationSingletonBreak(){}
}
class TestSerializationSingletonBreak
{
    public static void main(String[] args) {
        try {
            SerializationSingletonBreak obj1 = SerializationSingletonBreak.INSTANCE;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(obj1);


            // deserialize from file to object;
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            SerializationSingletonBreak obj2 = (SerializationSingletonBreak) in.readObject();
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
