public class HotelFacade {
    private RoomBookingSystem roomBooking;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventManagement;
    private CleaningService cleaningService;

    public HotelFacade() {
        this.roomBooking = new RoomBookingSystem();
        this.restaurant = new RestaurantSystem();
        this.eventManagement = new EventManagementSystem();
        this.cleaningService = new CleaningService();
    }

    public void bookRoomWithServices() {
        roomBooking.bookRoom();
        restaurant.orderFood();
        cleaningService.scheduleCleaning();
        System.out.println("Номер забронирован с услугами ресторана и уборки.");
    }

    public void organizeEvent() {
        eventManagement.bookConferenceHall();
        eventManagement.bookEquipment();
        roomBooking.bookRoom();
        System.out.println("Мероприятие организовано с номерами для участников и оборудованием.");
    }

    public void bookRestaurantWithTaxi() {
        restaurant.bookTable();
        restaurant.callTaxi();
        System.out.println("Столик забронирован с вызовом такси.");
    }

    public void cancelRoomBooking() {
        roomBooking.cancelBooking();
    }

    public void requestImmediateCleaning() {
        cleaningService.performCleaning();
    }
}
