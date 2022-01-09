package pattern.creational.builder.model;


public class Square extends Shape {

    private float length = 1f;

    public Square() { }

    public Square(String color, Size size, float transparency) {
        super( color,  size,  transparency);
    }
}
