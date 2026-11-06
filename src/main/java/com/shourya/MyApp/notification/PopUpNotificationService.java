package com.shourya.MyApp.notification;

public class PopUpNotificationService implements NotificationService{

    @Override
    public void sentNotification() {
        System.out.println("PopUp Notification is Sended");
    }
}
