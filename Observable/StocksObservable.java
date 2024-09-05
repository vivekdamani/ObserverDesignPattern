package Observable;

import Observer.NotificationsAlertSubscriber;

public interface StocksObservable {
    
    public void addSubscriber(NotificationsAlertSubscriber user);
    public void removeSubscriber(NotificationsAlertSubscriber user);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
    
}