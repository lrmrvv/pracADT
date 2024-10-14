class DeliveryMethod(ABC):
    @abstractmethod
    def deliver(self):
        pass

class Courier(DeliveryMethod):
    def deliver(self):
        print("Доставка курьером.")

class Post(DeliveryMethod):
    def deliver(self):
        print("Доставка почтой.")

class PickUp(DeliveryMethod):
    def deliver(self):
        print("Доставка в пункт выдачи.")
