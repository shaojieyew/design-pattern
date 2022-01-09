package pattern.creational.abstract_factory;


import pattern.creational.abstract_factory.model.*;
public class ShapeFactory2 extends AbstractShapeFactory {


    public Shape createShape(ShapeType type){
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
