package pattern.behavioral.strategy;

public class PublicTransportRoute implements Route{
    @Override
    public void findRoute(int src, int dst) {
        System.out.println("PublicTransportRoute from "+ src +" to "+ dst);
    }
}
