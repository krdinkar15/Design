package designPatterns.creational.abstractFactory.shape;

public class FactoryProducer {
    public static AbstractFactory getFactory(String shape){
        if(shape.equalsIgnoreCase("ROUNDED")) {
            return new ShapeFactoryRounded();
        }
        else  if( shape.equalsIgnoreCase("CORNER"))
        {
            return new ShapeFactoryNormal();
        }
        return  null;
    }
}
