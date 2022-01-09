package pattern.structural.proxy;

public class MailSender implements IMailSender{
    @Override
    public void send(String msg) {
        System.out.println("sending msg: "+msg);
    }
}
