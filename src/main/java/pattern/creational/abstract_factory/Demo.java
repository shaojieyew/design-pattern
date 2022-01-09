package pattern.creational.abstract_factory;

import pattern.creational.abstract_factory.model.Circle;

public class Demo {
    public static void main(String args[]){
        Circle circle = (Circle) new ShapeFactory1().createShape(AbstractShapeFactory.ShapeType.CIRCLE);
        Circle circle1 = (Circle) new ShapeFactory2().createShape(AbstractShapeFactory.ShapeType.CIRCLE);
    }
}
