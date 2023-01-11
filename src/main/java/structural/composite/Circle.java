package structural.composite;

public class Circle implements Shape{
    @Override
    public void draw(String fillcolor) {
        System.out.println("Circle : "+fillcolor);
    }
}
