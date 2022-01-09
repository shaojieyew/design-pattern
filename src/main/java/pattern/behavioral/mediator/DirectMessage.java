package pattern.behavioral.mediator;

public class DirectMessage extends MessageController{

    public void sendMsg( Participant sender, String msg , Participant ... recipient){
        for (Participant rec : recipient) {
            rec.notify(sender, msg);
        }
    }

}
