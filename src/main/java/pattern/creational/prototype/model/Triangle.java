package pattern.creational.prototype.model;

public class Triangle extends Shape {

    public float length = 1f;

    public Triangle() { }
    public Triangle(Triangle triangle) {
        super(triangle);
        this.length = triangle.length;
    }

    public Triangle copy() {
        return new Triangle(this);
    }
}
