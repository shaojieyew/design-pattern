package pattern.behavioral.observer;

public class NewsFeed implements Publisher{

    String content;

    public void setContent(String content) {
        this.content = content;
        notifySubscriber();
    }
}
