
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
    // The "return new restaurant" part creates a new customer object using the
    // information provided.

    //I could not get the program to fuction properly when i closed the scaner. 
    //I tried the work arouds but they still were ot working. I came across a form that said you ca remove it ad it solved the problem but I couldny get it to work.
    public static Restaurant createRestaurant() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Restaurant name: ");
        String restaurantName = scanner2.nextLine();

        System.out.print("Restaurant location: ");
        String restaurantLocation = scanner2.nextLine();

        System.out.print("Restaurant contact number: ");
        String restaurantContactNumber = scanner2.nextLine();

        return new Restaurant(
                restaurantName,
                restaurantLocation,
                restaurantContactNumber);
    }

}