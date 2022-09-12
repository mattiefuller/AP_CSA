
public class HotelRoom { //hotel room class
    int roomNumber;
    public Person guestOne;
    public Person guestTwo;
    int totalGuests = 0;
    int guestAge;

    HotelRoom(int roomNum){ //hotel room constructors
        roomNumber = roomNum;
    }

    //checks in guests to room
    void checkIn (Person guest){

        if(totalGuests == 0){
            guestOne = guest;
            totalGuests++;
        }
        
        else if (totalGuests == 1){
            guestTwo = guest;
            totalGuests++;
        }

        else if (totalGuests == 2){ //can't check in more than 2 guests into a room
            System.out.println ("The hotel rooms are at full capacity!");
        }
    }
   
    //checks out guests from room
    void checkOut (Person guest){
        if (guest == guestOne){
            guestOne = null;
            totalGuests--;
        }

        else if (guest == guestTwo){
            guestTwo = null;
            totalGuests--;
        }

        else if (guest != guestOne && guest != guestTwo){
            System.out.println ("There are no guests in this room.");
        }
    }

    //checks the room capacity (full or not)
    int checkCapacity(){
        if(totalGuests == 0){
            System.out.println ("There are no guests in this room");
        }

        if(totalGuests == 1){
            System.out.println ("There is 1 guest in this room");
        }

        if(totalGuests == 2){
            System.out.println ("There are 2 guests in this room");
        }

        return totalGuests;
    }

    //prints guest information
    void printGuestInfo(){
        if (guestOne != null){
            System.out.println("Guest one's name is " + guestOne.name + ". " + guestOne.name + " is " + guestOne.age + " years old, " + guestOne.height + " feet tall, and has " + guestOne.hairColor + " hair."); 
        }
        
        if (guestTwo != null){
            System.out.println("Guest one's name is " + guestTwo.name + ". " + guestTwo.name + " is " + guestTwo.age + " years old, " + guestTwo.height + " feet tall, and has " + guestTwo.hairColor + " hair.");
        }
    }
}
