package pattern.creational.abstract_factory;


import pattern.creational.abstract_factory.model.*;

public class ShapeFactory1 extends AbstractShapeFactory {


    public Shape createShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle("red", Shape.Size.MEDIUM, 1f);
            case SQUARE:
                return new Square("red", Shape.Size.MEDIUM, 1f);
            case TRIANGLE:
                return new Triangle("red", Shape.Size.MEDIUM, 1f);
            default:
                return new Shape("red", Shape.Size.MEDIUM, 1f);
        }
    }

}
