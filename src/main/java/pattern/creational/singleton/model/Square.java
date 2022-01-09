package pattern.creational.singleton.model;

public class Square extends Shape {

    private float length = 1f;

    public Square() { }
    public Square(Square sq) {
        super(sq);
        this.length = sq.length;
    }

    public Square copy() {
        return new Square(this);
    }
}
