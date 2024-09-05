import Observable.IphoneStockObservable;
import Observable.StocksObservable;
import Observer.EmailNotification;
import Observer.MessageNotification;
import Observer.NotificationsAlertSubscriber;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphone = new IphoneStockObservable();
        NotificationsAlertSubscriber observer1 = new EmailNotification("xyz@gmail.com" , iphone);
        iphone.addSubscriber(observer1);
        NotificationsAlertSubscriber observer2 = new EmailNotification("abc@gmail.com" , iphone);
        iphone.addSubscriber(observer2);
        NotificationsAlertSubscriber observer3 = new MessageNotification("1234567890" , iphone);
        iphone.addSubscriber(observer3);
        NotificationsAlertSubscriber observer4 = new MessageNotification("3458345434" , iphone);
        iphone.addSubscriber(observer4);
        

        iphone.setStockCount(10);

    }
}
