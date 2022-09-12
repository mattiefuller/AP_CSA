public class HotelMain {
    public static void main(String[] args){
        HotelRoom roomOne = new HotelRoom(1);
        Person guestOne = new Person (5.4, 20, "Meredith", "blonde");
        Person guestTwo = new Person (6.8, 24, "Derick", "brown");
        Person guestThree = new Person (5.2, 18, "Amelia", "brown");
        roomOne.checkIn(guestOne); //checks in guestOne
        roomOne.checkIn(guestTwo); //checks in guesttwo
        roomOne.checkIn(guestThree); //tries to check in guestThree, but "The hotel rooms are at full capacity!", so guestThree can't check in
        roomOne.printGuestInfo(); //prints info of guestOne & guestTwo
        roomOne.checkOut(guestTwo);
        roomOne.checkIn(guestThree);
        roomOne.printGuestInfo();

    }
}

