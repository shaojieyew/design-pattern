package pattern.structural.composition.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFarm {

    private List<Animal> animals ;

    public void addAnimal(Animal ... animals ){
        if(animals == null){
            this.animals = new ArrayList<Animal>();
        }
        this.animals.addAll(Arrays.asList(animals));
    }

    public void scream(){
         animals.forEach(Animal::scream);
    }

}
