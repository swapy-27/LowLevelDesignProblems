import java.util.*;
import java.util.stream.Collectors;

public class ParkingLot {
    private ArrayList<ArrayList<Object>> parkingLot;


    public ArrayList<ArrayList<Object>> getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ArrayList<ArrayList<Object>> parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingLot(int floors , int slots){
        ArrayList<List<Object>> matrix = new ArrayList<List<Object>>(floors);

        ArrayList<Object> slot = new ArrayList<Object>(slots);

         this.setParkingLot((ArrayList)matrix.stream().map(floor->floor=slot).collect(Collectors.toList()));

        System.out.println(this.getParkingLot());
    }


}
