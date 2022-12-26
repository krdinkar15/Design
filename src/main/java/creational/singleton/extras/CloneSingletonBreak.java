package creational.singleton.extras;
class SuperClass1 implements Cloneable
{
    int i=10;
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class CloneSingletonBreak  extends SuperClass1{
    public static CloneSingletonBreak INSTANCE=new CloneSingletonBreak();
    private CloneSingletonBreak()
    {

    }
}
class TestCloneSingletonBreak{
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneSingletonBreak obj1=CloneSingletonBreak.INSTANCE;
        CloneSingletonBreak obj2=(CloneSingletonBreak) obj1.clone();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
