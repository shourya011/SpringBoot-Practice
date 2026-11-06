package com.shourya.MyApp.notification;

public class EmailService implements NotificationService {

    @Override
    public void sentNotification() {
        System.out.println("Email is Sended");
    }
}
