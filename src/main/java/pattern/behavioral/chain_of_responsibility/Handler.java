package pattern.behavioral.chain_of_responsibility;

public abstract class Handler {

    protected Handler nextHandler;

    public void setNext(Handler next){
        nextHandler = next;
    }

    abstract public void service(Request request);

}
