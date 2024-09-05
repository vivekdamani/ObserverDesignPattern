package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationsAlertSubscriber;

public class IphoneStockObservable implements StocksObservable{

    public List<NotificationsAlertSubscriber> IphoneNotificationObservers = new ArrayList<>();
    int stockCount=0;

    @Override
    public void addSubscriber(NotificationsAlertSubscriber user) {
        IphoneNotificationObservers.add(user);
    }

    @Override
    public void removeSubscriber(NotificationsAlertSubscriber user) {
        IphoneNotificationObservers.remove(user);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationsAlertSubscriber observer : IphoneNotificationObservers)
        {
            observer.notifyUsers();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0)
        {
            notifySubscriber();
        }
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
    
}
