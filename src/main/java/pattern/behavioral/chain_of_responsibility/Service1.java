package pattern.behavioral.chain_of_responsibility;

public class Service1 extends Handler {
    @Override
    public void service(Request request) {

        if(request.value%1==0){
            System.out.println("Service1 servicing "+request.value);
        }else{
            if(nextHandler!=null){
                nextHandler.service(request);
            }
        }

    }
}
