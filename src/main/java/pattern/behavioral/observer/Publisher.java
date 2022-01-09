package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Publisher {

    List<Subscriber> subscribers = new ArrayList<>();

    default void addSubscriber(Subscriber ... subscriber){
        subscribers.addAll(Arrays.asList(subscriber));
    }
    default void removeSubscriber(Subscriber  subscriber){
        subscribers.remove(subscriber);
    }

    default void notifySubscriber(){
        for (Subscriber subscriber : subscribers) {
          subscriber.onEvent(this);
        }
    }

}
