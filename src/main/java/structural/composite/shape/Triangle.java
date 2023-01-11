package structural.composite.shape;

public class Triangle implements Shape{
    @Override
    public void draw(String fillcolor) {
        System.out.println("Triange : "+fillcolor);
    }
}
