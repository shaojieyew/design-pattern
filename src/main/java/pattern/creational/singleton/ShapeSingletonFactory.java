package pattern.creational.singleton;


import pattern.creational.singleton.model.*;

public class ShapeSingletonFactory {

    private static ShapeSingletonFactory factory;

    public static ShapeSingletonFactory getInstance(){
        if (factory!=null){
            factory =  new ShapeSingletonFactory();
        }
        return factory;
    }

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
                return null;
        }
    }

}
