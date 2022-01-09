package pattern.behavioral.template_method;

public class ConcreteClass1  implements TemplateClass{


    @Override
    public void method2() {
        System.out.println("running ConcreteClass1 method2");
    }


    @Override
    public void method4() {
        System.out.println("running ConcreteClass1 method4");
    }

}
