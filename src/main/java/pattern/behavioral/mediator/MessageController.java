package pattern.behavioral.mediator;

public abstract class MessageController {

    abstract void sendMsg( Participant sender,String msg , Participant ... recipent);

}
