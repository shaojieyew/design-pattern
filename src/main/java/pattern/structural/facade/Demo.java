package pattern.structural.facade;

import pattern.structural.decorator.model.DrinkComponent;
import pattern.structural.decorator.model.drink_component.Bubble;
import pattern.structural.decorator.model.drink_component.Cream;
import pattern.structural.decorator.model.drink_component.MilkTea;

public class Demo {

  public static void main(String[] args) {
    /**
     * Check whether it’s possible to provide a simpler interface than what an existing subsystem
     * already provides. You’re on the right track if this interface makes the client code
     * independent from many of the subsystem’s classes.
     *
     * <p>Declare and implement this interface in a new facade class. The facade should redirect the
     * calls from the client code to appropriate objects of the subsystem. The facade should be
     * responsible for initializing the subsystem and managing its further life cycle unless the
     * client code already does this.
     *
     * <p>To get the full benefit from the pattern, make all the client code communicate with the
     * subsystem only via the facade. Now the client code is protected from any changes in the
     * subsystem code. For example, when a subsystem gets upgraded to a new version, you will only
     * need to modify the code in the facade.
     *
     * <p>If the facade becomes too big, consider extracting part of its behavior to a new, refined
     * facade class.
     */
  }
}
