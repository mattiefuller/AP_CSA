package classes.project;

public class HotelMain {
    public static void main(String[] args){
        HotelRoom roomOne = new HotelRoom(1);
        Person guestOne = new Person (5.4, 20, "Meredith", "blonde");
        Person guestTwo = new Person (6.8, 24, "Derick", "brown");
        System.out.println(guestOne.name);
        System.out.println(guestTwo.name);
        roomOne.checkIn(guestOne);
        System.out.println(roomOne.totalGuests);
    }
}
