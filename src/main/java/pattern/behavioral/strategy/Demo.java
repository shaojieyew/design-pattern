package pattern.behavioral.strategy;


public class Demo {

    public static void main(String args[]){

        Route route = new CarRoute();
        route.findRoute(123,232);

        route = new PublicTransportRoute();
        route.findRoute(123,232);

        route = new BicycleRoute();
        route.findRoute(123,232);

    }

}
