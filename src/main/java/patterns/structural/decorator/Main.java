package main.java.patterns.structural.decorator;

/**
 * Created by rohit.jh on 11/06/19
 */
public class Main {

    public static void main(String[] args) {
        // Draw only shape
        Shape circle = new Circle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("--------------------------------------------------");

        //Draw shape with border color
        ShapeDecorator borderColoredCircle = new BorderColor(new Circle(), "RED");
        borderColoredCircle.draw();
        ShapeDecorator borderColoredRectangle = new BorderColor(new Rectangle(), "BLUE");
        borderColoredRectangle.draw();
        System.out.println("--------------------------------------------------");

        //Draw shape with border color and color fill
        ShapeDecorator colorFilledBorderColoredCircle = new ColorFiller(new BorderColor(new Circle(), "BLACK"), "RED");
        colorFilledBorderColoredCircle.draw();
        ShapeDecorator colorFilledBorderColoredRectangle = new ColorFiller(new BorderColor(new Rectangle(), "YELLOW"), "PURPLE");
        colorFilledBorderColoredRectangle.draw();
        System.out.println("--------------------------------------------------");
    }
}
