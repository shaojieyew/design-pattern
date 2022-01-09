package pattern.behavioral.mediator;

public class Demo {

    public static void main (String [] args){

        Participant participant1 = new Participant("Peter");
        Participant participant2 = new Participant("John");
        Participant participant3 = new Participant("Mary");

        GroupChat groupChat = new GroupChat();
        groupChat.joinGroupChat(participant1);
        groupChat.joinGroupChat(participant2);
        groupChat.joinGroupChat(participant3);
        groupChat.sendMsg(participant1, "Hello Everyone");

        DirectMessage dm = new DirectMessage();
        dm.sendMsg(participant1, "Hello, this is a private message", participant2, participant3);

    }

}
