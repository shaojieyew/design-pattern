package pattern.creational.factory.model;

public class Shape {

    public enum Size {
        SMALL, MEDIUM, BIG
    }

    private String color;
    private Size size;
    private float transparency = 1f;
    private float x = 0f;
    private float y = 0f;

    public Shape() { }

    public Shape(String color, Size size, float transparency) {
        this.color = color;
        this.size = size;
        this.transparency = transparency;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }
}
