package pattern.creational.factory;

import pattern.creational.factory.model.*;
public class ShapeFactory {

    enum ShapeType{
        CIRCLE, SQUARE, TRIANGLE;
    }

    public Shape create(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            default:
                return new Shape();
        }
    }

}
