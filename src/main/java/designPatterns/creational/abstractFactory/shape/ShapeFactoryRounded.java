package designPatterns.creational.abstractFactory.shape;

public class ShapeFactoryRounded extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleRounded();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareRounded();
        }
        return null;

    }
}
