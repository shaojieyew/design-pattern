package pattern.creational.builder;

import pattern.creational.builder.model.*;

public class ShapeBuilder {

    private String color;
    private Shape.Size size;
    private float transparency = 1f;

    public ShapeBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ShapeBuilder setSize(Shape.Size size) {
        this.size = size;
        return this;
    }
    public ShapeBuilder setTransparency(float transparency) {
        this.transparency = transparency;
        return this;
    }

    public Shape build(){
        return new Shape(color, size, transparency);
    }


}
