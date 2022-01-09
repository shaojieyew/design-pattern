package pattern.structural.proxy;

public class MailProxy implements IMailSender{

    IMailSender mailSender;

    public MailProxy(){
        mailSender = new MailSender();
    }

    @Override
    public void send(String msg) {
        if(msg.contains("money")){
            System.out.println("message dropped");
        }else{
            mailSender.send(msg);
        }
    }
}
