
import java.util.Scanner;

public class Restaurant {
    // Restaurant class:
    // Creates the Restaurant and displays the variables
    String restaurantName;
    String restaurantLocation;
    String restaurantContactNumber;

    // Restaurant constructor:
    // Constructor initialises the various attributes of the Restaurant object.

    public Restaurant(String restaurantName, String restaurantLocation, String restaurantContactNumber) {

        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.restaurantContactNumber = restaurantContactNumber;
    }

    // Getter methods:
    // These methods allow for access the the values of the variables in the
    // Restaurant class
    String getRestaurantName() {
        return restaurantName;
    }

    String getRestaurantLocation() {
        return restaurantLocation;
    }

    String getRestaurantContactNumber() {
        return restaurantContactNumber;
    }

    // Method for creating the restaurant object:
    // The scanner reads the user input from the user and stores it in the
    // respective variables.
    // A while loop is used as ann input validator. The user cannot leave the input field empty
    // The "return new restaurant" part creates a new customer object using the
    // information provided.

    public static Restaurant createRestaurant() {
        Scanner scanner = new Scanner(System.in);

        String restaurantName = "";
        while (restaurantName.isEmpty()) {
            System.out.print("Restaurant name: ");
            restaurantName = scanner.nextLine();
            if (restaurantName.isEmpty()) {
                System.out.println("Restaurant name cannot be empty. Please try again.");
            }
        }

        String restaurantLocation = "";
        while (restaurantLocation.isEmpty()) {
            System.out.print("Restaurant location: ");
            restaurantLocation = scanner.nextLine();
            if (restaurantLocation.isEmpty()) {
                System.out.println("Restaurant location cannot be empty. Please try again.");
            }
        }

        String restaurantContactNumber = "";
        while (restaurantContactNumber.isEmpty()) {
            System.out.print("Restaurant contact number: ");
            restaurantContactNumber = scanner.nextLine();
            if (restaurantContactNumber.isEmpty()) {
                System.out.println("Restaurant contact number cannot be empty. Please try again.");
            }
        }

        return new Restaurant(
                restaurantName,
                restaurantLocation,
                restaurantContactNumber);
    }

}
