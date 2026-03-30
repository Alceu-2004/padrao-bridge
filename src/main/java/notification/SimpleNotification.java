package notification;

import sender.MessageSender;
import formatter.MessageFormatter;
import log.NotificationLogger;

public class SimpleNotification extends Notification {

    private MessageFormatter formatter = new MessageFormatter();
    private NotificationLogger logger = new NotificationLogger();

    public SimpleNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        String formatted = formatter.formatSimple(message);
        sender.send(formatted);
        logger.log(formatted);
    }
}