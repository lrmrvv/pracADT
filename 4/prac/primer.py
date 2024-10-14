order = Order()

order.mprod("Ноутбук", 1, 1000)
order.mprod("Мышь", 2, 50)

order.mpayType(CreditCard())
order.mdelivery_method(Courier())

order.mdiscount_calculator(Percentage(10))

print(f"Общая стоимость заказа: {order.calculate_total()}")

order.checkout()

notification = Email()
notification.send("Ваш заказ успешно оформлен.")
