import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    // Driver Class:
    // Creates the Driver and displays the variables
    String driverName;
    String driverLocation;
    int deliveries;

    // Constructor initializes the various attributes of the Driver object.
    public Driver(String driverName, String driverLocation, int deliveries) {
        this.driverName = driverName;
        this.driverLocation = driverLocation;
        this.deliveries = deliveries;
    }

    // Getter methods:
    // These methods allow for access to the values of the variables in the Driver
    // class
    public String getDriverName() {
        return driverName;
    }

    public String getDriverLocation() {
        return driverLocation;
    }

    public int getDeliveries() {
        return deliveries;
    }

    // Read Drivers File:
    // A driver array with a size of 100 is created and a file object for the
    // drivers.txt is created.
    // The scanner reads data from the file. A while loop is used to iterate over
    // each line and split it into an array using the commas followed by a space (",
    // ") as a delimiter.
    // The if statement checks if the line contains 3 elements and if so it creates
    // a new driver object with the values and adds it to the array.
    // A catch block is added if the file is not found.
    public static Driver[] readDriversFile() throws FileNotFoundException {
        Driver[] drivers = new Driver[100];
        String fileName = "drivers.txt";
        File driversFile = new File(fileName);

        try (Scanner scanner = new Scanner(driversFile)) {
            int index = 0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] driverAttributes = line.split(", ");

                if (driverAttributes.length >= 3) {
                    String driverName = driverAttributes[0];
                    String driverLocation = driverAttributes[1];
                    int deliveries = Integer.parseInt(driverAttributes[2]);

                    Driver driver = new Driver(driverName, driverLocation, deliveries);
                    drivers[index] = driver;
                    index++;

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        }

        return drivers;
    }

}
