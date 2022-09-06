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
        if(totalGuests == 0){
            guest = guestOne;
            totalGuests++;
        }
        
        else if (totalGuests == 1){
            guest = guestTwo;
            totalGuests++;
        }

        else if (totalGuests == 2){
            System.out.println ("The hotel rooms are at full capacity!");
        }
    }
    //checks out guests from room
    void checkOut (Person guest){
        if (guest = guestOne){
            guestOne = 
        }

        if (guest = guestTwo){

        }

    }
    //checks the room capacity (full or not)
    boolean checkCapacity(){
        return true;
    }

    //prints guest information
    void printGuestInfo(){

    }
}
