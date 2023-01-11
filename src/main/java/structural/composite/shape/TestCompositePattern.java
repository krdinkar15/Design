package structural.composite.shape;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape triangle1=new Triangle();
        Shape triangle2=new Triangle();
        Shape circle1=new Circle();

        Drawing drawing=new Drawing();
        drawing.addShape(triangle1);
        drawing.addShape(triangle2);
        drawing.addShape(circle1);

        drawing.draw("Red");
        drawing.clearAllShapes();

        drawing.addShape(circle1);
        drawing.addShape(triangle2);
        drawing.draw("Blue");
    }
}
