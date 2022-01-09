package pattern.behavioral.chain_of_responsibility;

public class Service3 extends Handler {
    @Override
    public void service(Request request) {
        if(request.value%3==0){
            System.out.println("Service3 servicing "+request.value);
        }else{
            if(nextHandler!=null){
                nextHandler.service(request);
            }
        }
    }
}