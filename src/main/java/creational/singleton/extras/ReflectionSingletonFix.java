package creational.singleton.extras;

import creational.singleton.Singleton1;


public class ReflectionSingletonFix {

    // enums are used because java ensures internally that the enum value is instantiated only once.
    // Since java Enums are globally accessible, they can be used for singletons
    // Its only drawback is that it is not flexible i.e it does not allow lazy initialization.
    // You cannot invoke an enum constructor yourself, so it is not possible for Reflection to utilize it
    // Hence, reflection can’t break singleton property in the case of enums.

    enum Singleton
    {
        INSTANCE
    }

    public static void main(String[] args) {
        Singleton s1=Singleton.INSTANCE;
        System.out.println(s1.hashCode());
    }


}
