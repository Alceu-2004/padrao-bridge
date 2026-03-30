package sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SenderTest {

    @Test
    void shouldSendEmailWithoutError() {
        MessageSender sender = new EmailSender();

        assertDoesNotThrow(() -> sender.send("Teste Email"));
    }

    @Test
    void shouldSendSMSWithoutError() {
        MessageSender sender = new SMSSender();

        assertDoesNotThrow(() -> sender.send("Teste SMS"));
    }
}