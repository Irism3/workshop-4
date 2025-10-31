import java.io.*;

public class DealershipFileManager {
    //responsible for reading and adding to file

    public Dealership getDealership() {
        String fileName = "src/main/resources/inventory.csv";
        Dealership dealership = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] lineParts = line.split("\\|");
            dealership = new Dealership(lineParts[0], lineParts[1], lineParts[2]);

            do {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                lineParts = line.split("\\|");
                int vin = Integer.parseInt(lineParts[0]);
                int year = Integer.parseInt(lineParts[1]);
                String make = lineParts[2];
                String model = lineParts[3];
                String vehicleType = lineParts[4];
                String color = lineParts[5];
                int odometer = Integer.parseInt(lineParts[6]);
                double price = Double.parseDouble(lineParts[7]);
                Vehicle v = new Vehicle();
                dealership.addVehicle(v);


            } while (true);

        } catch (FileNotFoundException e) {
            System.out.println("Inventory not found" + fileName);
        } catch (IOException e) {
            System.out.println("error" + e);
        }
        return dealership;


    }
    public void saveDealership(Dealership dealership) {

    }
}
