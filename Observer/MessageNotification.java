package Observer;

import Observable.StocksObservable;

public class MessageNotification implements NotificationsAlertSubscriber{
    String mobNum;
    StocksObservable observable;
    public MessageNotification(String mobNum, StocksObservable observable)
    {
        this.mobNum = mobNum;
        this.observable = observable;
    }
    @Override
    public void notifyUsers() {
        sendmessage(mobNum , "Stock is back on Mobile");
    }

    private void sendmessage(String mobNum , String message)
    {
        System.out.println("Message sent to " + mobNum);
    }
    
}
