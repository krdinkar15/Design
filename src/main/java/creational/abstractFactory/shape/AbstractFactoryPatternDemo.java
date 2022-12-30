package creational.abstractFactory.shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("ROUNDED");
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();



        FactoryProducer.getFactory("CORNER").getShape("RECTANGLE").draw();
        FactoryProducer.getFactory("CORNER").getShape("SQUARE").draw();
    }
}
