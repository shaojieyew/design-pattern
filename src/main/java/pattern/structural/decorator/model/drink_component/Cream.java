package pattern.structural.decorator.model.drink_component;

import pattern.structural.decorator.model.DrinkAddOn;
import pattern.structural.decorator.model.DrinkComponent;

public class Cream extends DrinkAddOn {
    public Cream(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("add Cream");
    }
}
