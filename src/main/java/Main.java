import sender.EmailSender;
import sender.SMSSender;
import sender.MessageSender;
import notification.Notification;
import notification.SimpleNotification;
import notification.UrgentNotification;

public class Main {

    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        Notification urgent = new UrgentNotification(email);
        urgent.notifyUser("Servidor caiu!");

        System.out.println("-----");

        MessageSender sms = new SMSSender();
        Notification simple = new SimpleNotification(sms);
        simple.notifyUser("Bem-vindo ao sistema!");
    }
}