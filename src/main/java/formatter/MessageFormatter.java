package formatter;

public class MessageFormatter {

    public String formatSimple(String message) {
        return message;
    }

    public String formatUrgent(String message) {
        return "[URGENTE] " + message;
    }
}