package main.java.patterns.structural.decorator;

/**
 * Created by rohit.jh on 11/06/19
 */

abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}
