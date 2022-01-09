package pattern.structural.decorator.model.drink_component;

import pattern.structural.decorator.model.DrinkComponent;
import pattern.structural.decorator.model.DrinkFavour;

public class BlackTea extends DrinkFavour {

    public BlackTea() {
        super();
    }
    public BlackTea(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("add BlackTea");
    }
}
