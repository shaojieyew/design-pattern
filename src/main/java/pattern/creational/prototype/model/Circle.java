package pattern.creational.prototype.model;

public class Circle extends Shape {

    public float radius = 1f;

    public Circle() {
    }
    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public Circle copy() {
        return new Circle(this);
    }
}
