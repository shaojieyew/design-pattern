package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupChat extends MessageController{

    private List<Participant> participants =  new ArrayList<>();

    public void joinGroupChat(Participant participant){
        participants.add(participant);
    }

    public void sendMsg(Participant sender,String msg ){

        List<Participant> recipients =         participants.stream()
                .filter(participant -> !participant.equals(sender))
                .collect(Collectors.toList());

        Participant [] arr = new Participant[recipients.size()];
    sendMsg(
        sender,
        msg,
            recipients
            .toArray(arr));
    }

    public void sendMsg(Participant sender,String msg , Participant ... recipient){
        for (Participant participant : recipient) {
            participant.notify(sender, msg);
        }
    }

}
