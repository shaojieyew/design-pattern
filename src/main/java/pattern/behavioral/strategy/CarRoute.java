package pattern.behavioral.strategy;

public class CarRoute implements Route{
    @Override
    public void findRoute(int src, int dst) {
        System.out.println("CarRoute from "+ src +" to "+ dst);
    }
}
