package pattern.behavioral.command;

public class Demo {
    public static void main(String args[]){
        Command cmd1 = new PrintHello();
        Command cmd2 = new PrintBye();
        Executor executor = new Executor();
        executor.addCommand(cmd1);
        executor.addCommand(cmd2);

        executor.execute();
    }
}
