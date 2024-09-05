package Observer;

import Observable.StocksObservable;

public class EmailNotification implements NotificationsAlertSubscriber{
    String emailId;
    StocksObservable observable;
    public EmailNotification(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    
    @Override
    public void notifyUsers() {
        sendmail(emailId , "Stock is back");
    }

    private void sendmail(String emailId , String message)
    {
        System.out.println("Mail sent to " + emailId);
    }
    
}
