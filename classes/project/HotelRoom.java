package classes.project;

public class HotelRoom { //hotel room class
    int roomNumber;
    Person guestOne;
    Person guestTwo;
    int totalGuests = 0;

    HotelRoom(int roomNum){ //hotel room constructors
        roomNumber = roomNum;
    }

    //checks in guests to room
    void checkIn (Person guest){
        totalGuests++;
        
    }
    //checks out guests from room
    void checkOut (Person guest){

    }
    //checks the room capacity (full or not)
    void checkCapacity(){
        
    }

    //prints guest information
    void printGuestInfo(){

    }
}
