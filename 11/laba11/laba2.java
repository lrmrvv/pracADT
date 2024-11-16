import java.util.*;

interface IUserService {
    User register(String username, String password);
    User login(String username, String password);
}

interface IProductService {
    List<Product> getProducts();
    Product addProduct(Product product);
}

interface IOrderService {
    Order createOrder(int userId, List<Integer> productIds);
    Order getOrderStatus(int orderId);
}

interface IPaymentService {
    boolean processPayment(int orderId, double amount);
}

interface INotificationService {
    void sendNotification(int userId, String message);
}

class User {
    private int id;
    private String username;
    private String password;
    
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int id;
    private int userId;
    private List<Product> products;
    private String status;

    public Order(int userId, List<Product> products, String status) {
        this.id = new Random().nextInt(1000);
        this.userId = userId;
        this.products = products;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class UserService implements IUserService {
    private List<User> users = new ArrayList<>();
    
    @Override
    public User register(String username, String password) {
        User user = new User(users.size() + 1, username, password);
        users.add(user);
        return user;
    }
    
    @Override
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

class ProductService implements IProductService {
    private List<Product> products = new ArrayList<>();
    
    @Override
    public List<Product> getProducts() {
        return products;
    }
    
    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}

class OrderService implements IOrderService {
    private IProductService productService;
    private IPaymentService paymentService;
    private INotificationService notificationService;

    public OrderService(IProductService productService, IPaymentService paymentService, INotificationService notificationService) {
        this.productService = productService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }
    
    @Override
    public Order createOrder(int userId, List<Integer> productIds) {
        List<Product> products = new ArrayList<>();
        for (Product product : productService.getProducts()) {
            if (productIds.contains(product.getId())) {
                products.add(product);
            }
        }
        
        if (products.isEmpty()) {
            throw new RuntimeException("Selected products not found.");
        }

        Order order = new Order(userId, products, "Created");

        double totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
        if (paymentService.processPayment(order.getId(), totalAmount)) {
            order.setStatus("Paid");
            notificationService.sendNotification(userId, "Your order has been successfully paid.");
        } else {
            order.setStatus("Payment Failed");
            notificationService.sendNotification(userId, "Payment failed. Please try again.");
        }

        return order;
    }

    @Override
    public Order getOrderStatus(int orderId) {
        return new Order(orderId, "In Progress");
    }
}

class PaymentService implements IPaymentService {
    @Override
    public boolean processPayment(int orderId, double amount) {
        return true;
    }
}

class NotificationService implements INotificationService {
    @Override
    public void sendNotification(int userId, String message) {
        System.out.println("User " + userId + ": " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        IUserService userService = new UserService();
        IProductService productService = new ProductService();
        IPaymentService paymentService = new PaymentService();
        INotificationService notificationService = new NotificationService();
        IOrderService orderService = new OrderService(productService, paymentService, notificationService);
        
        User user = userService.register("john_doe", "password123");
        
        productService.addProduct(new Product(1, "Product1", 100.0));
        productService.addProduct(new Product(2, "Product2", 150.0));
        
        Order order = orderService.createOrder(user.getId(), Arrays.asList(1, 2));
        
        System.out.println("Order Status: " + order.getStatus());
    }
}
