package pattern.structural.decorator.model.drink_component;

import pattern.structural.decorator.model.DrinkComponent;
import pattern.structural.decorator.model.DrinkFavour;

public class Mocha extends DrinkFavour {

    public Mocha() {
        super();
    }
    public Mocha(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }
    @Override
    public void make() {
        super.make();
        System.out.println("add Mocha");
    }
}
