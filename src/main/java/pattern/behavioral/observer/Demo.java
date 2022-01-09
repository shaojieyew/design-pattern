package pattern.behavioral.observer;

public class Demo {


    public static void main(String args[]){

        NewsFeed newsFeed = new NewsFeed();
        newsFeed.setContent("This is a breaking news 1");

        NewsSubscriber newsSubscriber = new NewsSubscriber();
        newsFeed.addSubscriber(newsSubscriber);

        newsFeed.setContent("This is a breaking news 2");

        newsFeed.removeSubscriber(newsSubscriber);

        newsFeed.setContent("This is a breaking news 3");
    }

}
