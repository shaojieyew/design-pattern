package pattern.structural.decorator.model;

public abstract class DrinkAddOn extends DrinkComponent{

    public DrinkAddOn(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }
}
