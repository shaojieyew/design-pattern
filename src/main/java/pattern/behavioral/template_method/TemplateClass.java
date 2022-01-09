package pattern.behavioral.template_method;

public interface TemplateClass {

    default void method1(){
        System.out.println("running step 1");
    }
    default void method2(){
        System.out.println("running step 2");
    }
    default void method3(){
        System.out.println("running step 3");
    }
    default void method4(){
        System.out.println("running step 4");
    }
    default void method5(){
        System.out.println("running step 5");
    }

}
