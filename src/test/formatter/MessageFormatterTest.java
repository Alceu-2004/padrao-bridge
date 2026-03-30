package formatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageFormatterTest {

    @Test
    void shouldFormatSimpleMessage() {
        MessageFormatter formatter = new MessageFormatter();
        String result = formatter.formatSimple("Teste");

        assertEquals("Teste", result);
    }

    @Test
    void shouldFormatUrgentMessage() {
        MessageFormatter formatter = new MessageFormatter();
        String result = formatter.formatUrgent("Alerta");

        assertEquals("[URGENTE] Alerta", result);
    }
}