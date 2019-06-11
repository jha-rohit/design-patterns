package main.java.patterns.structural.decorator;

/**
 * Created by rohit.jh on 11/06/19
 */
public class BorderColor extends ShapeDecorator {

    private String color;

    public BorderColor(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Adding border with color : " + color);
    }
}
