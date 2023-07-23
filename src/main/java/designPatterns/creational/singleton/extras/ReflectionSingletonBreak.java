package designPatterns.creational.singleton.extras;

import java.lang.reflect.Constructor;

public class ReflectionSingletonBreak {
    public static ReflectionSingletonBreak obj=null;
    private ReflectionSingletonBreak()
    {
    }
    public static ReflectionSingletonBreak getInstance()
    {
        if(obj==null)
        {
            obj=new ReflectionSingletonBreak();
        }
        return  obj;
    }
}
class TestReflectionSingletonBreak
{
    public static void main(String[] args) {
        ReflectionSingletonBreak obj1= ReflectionSingletonBreak.getInstance();
        ReflectionSingletonBreak obj2=null;
        try {
            Constructor[] constructors= ReflectionSingletonBreak.class.getDeclaredConstructors();
            for(Constructor constructor:constructors)
            {
                constructor.setAccessible(true);
                obj2=(ReflectionSingletonBreak) constructor.newInstance();
                break;
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
