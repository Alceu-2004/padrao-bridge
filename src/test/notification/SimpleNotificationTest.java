package notification;

import org.junit.jupiter.api.Test;
import sender.MessageSender;

import static org.mockito.Mockito.*;

class SimpleNotificationTest {

    @Test
    void shouldSendWelcomeMessageViaSMS() {
        MessageSender sender = mock(MessageSender.class);
        SimpleNotification notification = new SimpleNotification(sender);

        String message = "Bem-vindo ao sistema!";
        notification.notifyUser(message);

        verify(sender).send("Bem-vindo ao sistema!");
    }

    @Test
    void shouldSendEventReminder() {
        MessageSender sender = mock(MessageSender.class);
        SimpleNotification notification = new SimpleNotification(sender);

        String message = "Seu evento começa em 10 minutos.";
        notification.notifyUser(message);

        verify(sender).send("Seu evento começa em 10 minutos.");
    }
}