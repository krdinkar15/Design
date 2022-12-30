package creational.abstractFactory.shape;

public abstract class AbstractFactory {
    // Abstract class to get factories for Normal and Rounded Shape Objects.
    abstract Shape getShape(String shapeType);
}
