package com.shourya.MyApp.notification;

public class FakeEmailSevice implements NotificationService{

    @Override
    public void sentNotification() {
        System.out.println("Dummy is Sended");
    }

}
