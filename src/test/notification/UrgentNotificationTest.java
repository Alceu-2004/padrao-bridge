package notification;

import org.junit.jupiter.api.Test;
import sender.MessageSender;

import static org.mockito.Mockito.*;

class UrgentNotificationTest {

    @Test
    void shouldSendUrgentMessageCorrectly() {
        MessageSender sender = mock(MessageSender.class);
        UrgentNotification notification = new UrgentNotification(sender);

        notification.notifyUser("Erro");

        verify(sender).send("[URGENTE] Erro");
    }
}