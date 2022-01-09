package pattern.creational.abstract_factory.model;

public class Triangle extends Shape {

    private float length = 1f;

    public Triangle() { }

    public Triangle(String color, Size size, float transparency) {
        super( color,  size,  transparency);
    }

}
