package pattern.creational.singleton;

import pattern.creational.singleton.model.*;
import static pattern.creational.singleton.ShapeSingletonFactory.ShapeType.CIRCLE;

public class Demo {

    public static void main(String args[]){
        Shape shape = ShapeSingletonFactory.getInstance().create(CIRCLE);
    }

}
