package designPatterns.creational.singleton.extras;
class SuperClass2 implements Cloneable
{
    int i=10;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CloneSingletonFix {
    public static CloneSingletonFix INSTANCE=new CloneSingletonFix();
    private CloneSingletonFix()
    {

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException();
        return INSTANCE;
    }

}
class TestCloneSingletonFix
{
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneSingletonFix obj1=CloneSingletonFix.INSTANCE;
        CloneSingletonFix obj2=(CloneSingletonFix)  obj1.clone();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

