package pattern.structural.decorator.model.drink_component;

import pattern.structural.decorator.model.DrinkComponent;
import pattern.structural.decorator.model.DrinkFavour;

public class MilkTea extends DrinkFavour {
    public MilkTea() {
        super();
    }
    public MilkTea(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("add MilkTea");
    }
}
