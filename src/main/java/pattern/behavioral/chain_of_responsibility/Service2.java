package pattern.behavioral.chain_of_responsibility;

public class Service2 extends Handler {
    @Override
    public void service(Request request) {
        if(request.value%2==0){
            System.out.println("Service2 servicing "+request.value);
        }else{
            if(nextHandler!=null){
                nextHandler.service(request);
            }
        }
    }
}