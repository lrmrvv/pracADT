from abc import ABC, abstractmethod

class PayType(ABC):
    @abstractmethod
    def pay(self, amount):
        pass

class Card(PayType):
    def pay(self, amount):
        print(f"Оплата {amount} с помощью кредитной карты.")

class PayPal(PayType):
    def pay(self, amount):
        print(f"Оплата {amount} через PayPal.")

class Bank(PayType):
    def pay(self, amount):
        print(f"Оплата {amount} банковским переводом.")
