import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
//    Create the parking lot.
//    Add floors to the parking lot.
//    Add a parking lot slot to any of the floors.
//    Given a vehicle, it finds the first available slot, books it, creates a ticket, parks the vehicle, and finally returns the ticket.
//    Unparks a vehicle given the ticket id.
//    Displays the number of free slots per floor for a specific vehicle type.
//    Displays all the free slots per floor for a specific vehicle type.
//    Displays all the occupied slots per floor for a specific vehicle type.
    private   static  boolean continueInput = true;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       while(continueInput){
           String input = sc.nextLine();
           List<String> inputArray = List.of(input.split(" "));
           functionCall(inputArray);
       }
    }

    public static  void functionCall(List<String> inputArray){
        switch(inputArray.get(0)){
            case "create_parking_lot":
                ParkingLot p = new ParkingLot(Integer.parseInt(inputArray.get(2)),Integer.parseInt(inputArray.get(3)));
            case "display":
                switch (inputArray.get(1)){
                    case "occupied_slots":

                    case "free_slots":

                    case "free_count":

                }
            case "park_vehicle":

            case "unpark_vehicle":

            case "exit":
                continueInput=false;

            default:
                System.out.println("Please input correct command !");
        }
    }
}