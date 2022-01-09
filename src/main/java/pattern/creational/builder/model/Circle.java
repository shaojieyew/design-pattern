package pattern.creational.builder.model;


public class Circle extends Shape {

    public float radius = 1f;

    public Circle() { }

    public Circle(String color, Size size, float transparency) {
         super( color,  size,  transparency);
    }
}
