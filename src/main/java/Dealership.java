import java.util.ArrayList;
import java.util.List;

public class Dealership {

   private String name;
   private String address;
   private String phone;
   private List<Vehicle> inventory;


   public Dealership (){

   }

    public Dealership (String name,String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getInventory() {
        return new ArrayList<>(inventory);
    }

    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }
    //derived getters not from this class
    public List<Vehicle> getVehicles(){
       return new ArrayList<>(inventory);
    }
    public List<Vehicle>getVehiclesByPrice(double min, double max){
       return null;
    }
    public List<Vehicle>getVehicleByMake(String make, String model){
       return null;
    }
    public List<Vehicle>getVehicleBYYear(double min, double max){
        return null;
    }
    public List<Vehicle>getVehicleByColor(String color){
        return null;
    }
    public List<Vehicle>getVehicleByMileage(double min, double max){
        return null;
    }
    public List<Vehicle>getVehicleByType(String vehicleType){
        return null;
    }
    public void addVehicle(Vehicle v){
       inventory.add(v);

    }
    public void removeVehicle(String vehicle){

    }

}

