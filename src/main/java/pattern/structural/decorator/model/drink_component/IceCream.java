package pattern.structural.decorator.model.drink_component;

import pattern.structural.decorator.model.DrinkAddOn;
import pattern.structural.decorator.model.DrinkComponent;

public class IceCream extends DrinkAddOn {
    public IceCream(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }
    @Override
    public void make() {
        super.make();
        System.out.println("add IceCream");

    }
}
