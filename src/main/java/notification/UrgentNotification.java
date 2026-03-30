package notification;

import sender.MessageSender;
import formatter.MessageFormatter;
import log.NotificationLogger;

public class UrgentNotification extends Notification {

    private MessageFormatter formatter = new MessageFormatter();
    private NotificationLogger logger = new NotificationLogger();

    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        String formatted = formatter.formatUrgent(message);
        sender.send(formatted);
        logger.log(formatted);
    }
}