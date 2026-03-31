package notification;

import org.junit.jupiter.api.Test;
import sender.MessageSender;

import static org.mockito.Mockito.*;

class BridgeNotificationTest {

    @Test
    void shouldSwitchSenderDynamically() {
        MessageSender emailSender = mock(MessageSender.class);
        MessageSender smsSender = mock(MessageSender.class);

        Notification notificationEmail = new SimpleNotification(emailSender);
        Notification notificationSMS = new SimpleNotification(smsSender);

        notificationEmail.notifyUser("Atualização enviada por email");
        notificationSMS.notifyUser("Atualização enviada por SMS");

        verify(emailSender).send("Atualização enviada por email");
        verify(smsSender).send("Atualização enviada por SMS");
    }
}