package pattern.behavioral.command;

public class PrintBye extends Command {

    @Override
    void execute() {
        System.out.println("Bye world!");
    }
}
