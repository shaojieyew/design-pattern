package pattern.structural.composition;


import pattern.structural.composition.model.*;

public class Demo {

    public static void main(String args[]){

        Animal[] animals  = {new Dog(),
         new Duck(),
         new Horse(),
         new Chicken(),
         new Dog(),
         new Chicken()};

        AnimalFarm farm = new AnimalFarm();
        farm.addAnimal(animals);
        farm.scream();
    }

}
