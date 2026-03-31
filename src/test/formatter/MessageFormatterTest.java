package formatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageFormatterTest {

    @Test
    void shouldFormatUrgentMessageCorrectly() {
        MessageFormatter formatter = new MessageFormatter();

        String result = formatter.formatUrgent("Servidor caiu!");

        assertEquals("[URGENTE] Servidor caiu!", result);
    }

    @Test
    void shouldKeepSimpleMessageUnchanged() {
        MessageFormatter formatter = new MessageFormatter();

        String result = formatter.formatSimple("Bem-vindo!");

        assertEquals("Bem-vindo!", result);
    }
}