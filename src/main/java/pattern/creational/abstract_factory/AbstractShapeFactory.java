package pattern.creational.abstract_factory;


import pattern.creational.abstract_factory.model.Shape;

public abstract class AbstractShapeFactory {

    enum ShapeType{
        CIRCLE, SQUARE, TRIANGLE;
    }
    abstract Shape createShape(ShapeType type);

}
