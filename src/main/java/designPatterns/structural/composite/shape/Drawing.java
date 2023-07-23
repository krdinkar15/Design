package designPatterns.structural.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    // Collection of Shapes
    private List<Shape> shapes=new ArrayList<>();
    @Override
    public void draw(String fillcolor) {
        for(Shape shape:shapes)
        {
            shape.draw(fillcolor);
        }

    }

    public void addShape(Shape s)
    {
        this.shapes.add(s);
    }
    public void removeShape(Shape s)
    {
        this.shapes.remove(s);
    }
    public void clearAllShapes()
    {
        System.out.println("Clearing all shapes");
        this.shapes.clear();
    }

}
