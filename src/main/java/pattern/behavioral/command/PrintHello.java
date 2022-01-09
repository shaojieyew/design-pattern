package pattern.behavioral.command;

public class PrintHello extends Command {

    @Override
    void execute() {
        System.out.println("Hello world!");
    }
}
