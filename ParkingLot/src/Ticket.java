public class Ticket {

    private String Id;


    public Ticket(String parking_lot_id , int floor_no , int slot_no){
        this.Id=parking_lot_id+floor_no+slot_no;
    }

    public String getId() {
        return Id;
    }


}
