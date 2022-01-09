package pattern.behavioral.mediator;

public class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public void notify(Participant from, String msg){
        System.out.println(String.format("%s -- From %s: %s", name, from.name, msg));
    }
}
