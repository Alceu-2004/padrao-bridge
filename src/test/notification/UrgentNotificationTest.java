package notification;

import org.junit.jupiter.api.Test;
import sender.MessageSender;

import static org.mockito.Mockito.*;

class UrgentNotificationTest {

    @Test
    void shouldSendSystemFailureAlert() {
        MessageSender sender = mock(MessageSender.class);
        UrgentNotification notification = new UrgentNotification(sender);

        String message = "Servidor caiu!";
        notification.notifyUser(message);

        verify(sender).send("[URGENTE] Servidor caiu!");
    }

    @Test
    void shouldSendSecurityAlert() {
        MessageSender sender = mock(MessageSender.class);
        UrgentNotification notification = new UrgentNotification(sender);

        String message = "Tentativa de acesso suspeito!";
        notification.notifyUser(message);

        verify(sender).send("[URGENTE] Tentativa de acesso suspeito!");
    }
}