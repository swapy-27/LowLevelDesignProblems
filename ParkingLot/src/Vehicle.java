public class Vehicle {
    private String registrationNum;
    private String color;

    private String type;

    public Vehicle(String registrationNum, String color, String type) {
        this.registrationNum = registrationNum;
        this.color = color;
        this.type = type;
    }


    public String get_Vehicle_Details() {
        return "Vehicle{" +
                "registrationNum='" + registrationNum + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
