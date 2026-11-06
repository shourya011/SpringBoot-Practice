package com.shourya.MyApp.notification;

public class SmsService implements NotificationService{

    @Override
    public void sentNotification() {
        System.out.println("Sms is Sended");
    }

}
