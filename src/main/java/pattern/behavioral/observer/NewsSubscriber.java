package pattern.behavioral.observer;

public class NewsSubscriber implements Subscriber{


    @Override
    public void onEvent(Publisher publisher) {
        if(publisher instanceof NewsFeed){
            System.out.println("News update: " + ((NewsFeed)publisher).content);
        }
    }
}
