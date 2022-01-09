package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void execute(){
        commands.forEach(Command::execute);
    }

}
