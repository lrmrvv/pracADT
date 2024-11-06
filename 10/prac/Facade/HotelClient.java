public class HotelClient {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

        hotelFacade.bookRoomWithServices();
        
        hotelFacade.organizeEvent();

        hotelFacade.bookRestaurantWithTaxi();

        hotelFacade.cancelRoomBooking();
        hotelFacade.requestImmediateCleaning();
    }
}
