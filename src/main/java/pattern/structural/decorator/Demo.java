package pattern.structural.decorator;

import pattern.structural.decorator.model.DrinkComponent;
import pattern.structural.decorator.model.drink_component.Bubble;
import pattern.structural.decorator.model.drink_component.Cream;
import pattern.structural.decorator.model.drink_component.MilkTea;

public class Demo {

    public static void main(String [] args){

        DrinkComponent drinkComponent = new Cream(new Bubble(new MilkTea()));
        drinkComponent.make();

    }

}
