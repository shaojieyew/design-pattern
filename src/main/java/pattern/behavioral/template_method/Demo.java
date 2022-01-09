package pattern.behavioral.template_method;


import pattern.behavioral.strategy.BicycleRoute;
import pattern.behavioral.strategy.CarRoute;
import pattern.behavioral.strategy.PublicTransportRoute;
import pattern.behavioral.strategy.Route;

public class Demo {


    public void executeTasks(TemplateClass templateClass){
        templateClass.method1();
        templateClass.method2();
        templateClass.method3();
        templateClass.method4();
        templateClass.method5();
    }

    public static void main(String args[]){

        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();

        Demo demo = new Demo();
        demo.executeTasks(concreteClass1);
        demo.executeTasks(concreteClass2);
    }

}
