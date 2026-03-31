package sender;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SenderTest {

    @Test
    void shouldSendEmailWithCorrectMessage() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MessageSender sender = new EmailSender();
        sender.send("Servidor caiu!");

        System.setOut(originalOut);

        String result = output.toString().trim();
        assertTrue(result.contains("EMAIL enviado: Servidor caiu!"));
    }

    @Test
    void shouldSendSMSWithCorrectMessage() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MessageSender sender = new SMSSender();
        sender.send("Bem-vindo ao sistema!");

        System.setOut(originalOut);

        String result = output.toString().trim();
        assertTrue(result.contains("SMS enviado: Bem-vindo ao sistema!"));
    }
}