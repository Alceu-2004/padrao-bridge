package notification;

import org.junit.jupiter.api.Test;
import sender.MessageSender;

import static org.mockito.Mockito.*;

class SimpleNotificationTest {

    @Test
    void shouldSendSimpleMessageCorrectly() {
        MessageSender sender = mock(MessageSender.class);
        SimpleNotification notification = new SimpleNotification(sender);

        notification.notifyUser("Olá");

        verify(sender).send("Olá");
    }
}