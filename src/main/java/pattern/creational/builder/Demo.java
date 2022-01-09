package pattern.creational.builder;

import pattern.creational.builder.model.*;

public class Demo {

    public static void main(String args[]){
        Shape shape = new ShapeBuilder()
                .setColor("red")
                .setSize(Shape.Size.SMALL)
                .setTransparency(1f)
                .build();
    }
}
