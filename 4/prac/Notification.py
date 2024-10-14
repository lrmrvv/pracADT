class Notification(ABC):
    @abstractmethod
    def send(self, message):
        pass

class Email(Notification):
    def send(self, message):
        print(f"Отправка email с сообщением: {message}")

class Sms(Notification):
    def send(self, message):
        print(f"Отправка SMS с сообщением: {message}")
