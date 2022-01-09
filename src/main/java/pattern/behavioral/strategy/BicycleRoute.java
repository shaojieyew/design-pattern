package pattern.behavioral.strategy;

public class BicycleRoute implements Route {
    @Override
    public void findRoute(int src, int dst) {
        System.out.println("BicycleRoute from "+ src +" to "+ dst);
    }
}
