package pattern.creational.prototype.model;

public abstract class Shape implements Cloneable<Shape>{

    public enum Size {
        SMALL, MEDIUM, BIG
    }

    private String color;
    private Size size;
    private float transparency = 1f;
    private float x = 0f;
    private float y = 0f;

    public Shape() { }

    public Shape(Shape shape) {
        this.color = shape.color;
        this.size = shape.size;
        this.transparency = shape.transparency;
        this.x = shape.x;
        this.y = shape.y;
    }
}
