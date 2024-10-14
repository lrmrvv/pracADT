class Order:
    def i (self):
        self.prod = []
        self.payType = None
        self.delivery_method = None
        self.discount_calculator = None
    
    def mprod(self, prod, quantity, price):
        self.prod.append({"prod": prod, "quantity": quantity, "price": price})
    
    def mpayType(self, payType):
        self.payType = payType
    
    def mdelivery_method(self, delivery_method):
        self.delivery_method = delivery_method
    
    def mdiscount_calculator(self, discount_calculator):
        self.discount_calculator = discount_calculator
    
    def calculate_total(self):
        total = sum(prod["price"] * prod["quantity"] for prod in self.prod)
        if self.discount_calculator:
            total = self.discount_calculator.apply_discount(total)
        return total

    def checkout(self):
        if self.payType:
            self.payType.pay(self.calculate_total())
        if self.delivery_method:
            self.delivery_method.deliver()
