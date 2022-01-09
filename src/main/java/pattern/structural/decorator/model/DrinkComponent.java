package pattern.structural.decorator.model;

public abstract class DrinkComponent{

    DrinkComponent drinkComponent;

    public DrinkComponent(){
    }

    public DrinkComponent(DrinkComponent drinkComponent){
        this.drinkComponent = drinkComponent;
    }

    public DrinkComponent getDrink() {
        return drinkComponent;
    }

    public void make(){
        if(drinkComponent!=null)
            drinkComponent.make();
    }
}
