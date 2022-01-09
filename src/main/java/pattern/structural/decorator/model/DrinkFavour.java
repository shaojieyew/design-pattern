package pattern.structural.decorator.model;

public abstract class DrinkFavour extends DrinkComponent{

    public DrinkFavour() {
        super();
    }
    public DrinkFavour(DrinkComponent drinkComponent) {
        super(drinkComponent);
    }
}
