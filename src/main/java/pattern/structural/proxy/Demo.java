package pattern.structural.proxy;

public class Demo {

    public static void main(String args[]){

        IMailSender mailer = new MailProxy();
        mailer.send("Hello!");
        mailer.send("Free money");

    }
}
