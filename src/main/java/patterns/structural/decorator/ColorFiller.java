package main.java.patterns.structural.decorator;

/**
 * Created by rohit.jh on 11/06/19
 */
public class ColorFiller extends ShapeDecorator {

    private String color;

    ColorFiller(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("Filling shape with color : " + color);
    }
}
