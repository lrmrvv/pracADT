public interface NotificationSender {
    void send(String message);
}

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

public class NotificationService {
    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.sendNotification("Hello via Email!");

        NotificationSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.sendNotification("Hello via SMS!");

    }}
