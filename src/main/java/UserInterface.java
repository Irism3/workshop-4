import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        init();
        boolean running = true;
        while (running) {
            display();
            System.out.println("Please Enter: ");
            String dealership = scanner.nextLine();

            switch (dealership) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Error. Please try again.");

            }


        }

    }

    private void processGetByPriceRequest() {

    }

    private void processGetByMakeRequest() {
    }

    private void processGetByYearRequest() {

    }

    private void processGetByColorRequest() {

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processGetAllVehiclesRequest() {

    }

    private void processAddVehicleRequest() {

    }

    private void processRemoveVehicleRequest() {

    }

    private void init() {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles to display");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
    private void displayMenu () {
        System.out.println("Dealership Menu ");
        System.out.println("1 - Find vehicles within a price range ");
        System.out.println("2 - Find vehicles by make or model ");
        System.out.println("3 - Find vehicles by year range ");
        System.out.println("4 - Find vehicles by color ");
        System.out.println("5 - Find vehicles by mileage range ");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("0 - Quit");
    }
}

