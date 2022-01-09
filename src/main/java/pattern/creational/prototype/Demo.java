package pattern.creational.prototype;

import pattern.creational.prototype.model.Circle;

public class Demo {
    public static void main(String args[]){
        Circle prototype1 = new Circle();
        Circle prototype2 = prototype1.copy();
    }
}
