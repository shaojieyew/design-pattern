package pattern.creational.factory;

import pattern.creational.factory.model.*;
public class Demo {
    public static void main(String args[]){
        Shape shape = new ShapeFactory().create(ShapeFactory.ShapeType.CIRCLE);
    }
}
