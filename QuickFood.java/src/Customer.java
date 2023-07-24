import java.util.Scanner;

public class Customer {
    // Customer Class:
    // Creates the customer and displays the variables
    int orderNumber;
    String customerName;
    String contactNumber;
    String address;
    String location;
    String emailAddress;
    String[] mealsOrdered;
    double[] mealPrices;
    String specialInstructions;
    double totalAmount;

    // Customer constructor:
    // Constructor initializes the various attributes of the customer object.
    public Customer(int orderNumber, String customerName, String contactNumber, String address, String location,
            String emailAddress, String[] mealsOrdered, double[] mealPrices, String specialInstructions,
            double totalAmount) {

        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.location = location;
        this.emailAddress = emailAddress;
        this.mealsOrdered = mealsOrdered;
        this.mealPrices = mealPrices;
        this.specialInstructions = specialInstructions;
        this.totalAmount = totalAmount;
    }

    // Getter methods:
    // These methods allow for access to the values of the variables in the customer
    // class
    int getOrderNumber() {
        return orderNumber;
    }

    String getCustomerName() {
        return customerName;
    }

    String getContactNumber() {
        return contactNumber;
    }

    String getAddress() {
        return address;
    }

    String getLocation() {
        return location;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    String[] getMealsOrdered() {
        return mealsOrdered;
    }

    double[] getMealPrices() {
        return mealPrices;
    }

    String getSpecialInstructions() {
        return specialInstructions;
    }

    double getTotalAmount() {
        return totalAmount;
    }

    // Method for creating the customer object:
    // The scanner reads the user input from the user and stores it in the
    // respective variables.
    // A while loop is used as ann input validator. The user cannot leave the input field empty
    // A for loop is used to determine the total price of the food ordered.
    // It iterates the number of meals. The user is prompted to enter the amount of
    // meals ordered and then the price for each meal. These are stored and then the
    // prices of the meals are added to the total amount.
    // The "return new Customer" part creates a new customer object using the
    // information provided.

    // I could not get the program to fuction properly when i closed the scaner.
    // I tried the work arouds but they still were ot working. I came across a form
    // that said you ca remove it ad it solved the problem but I couldny get it to
    // work.
    public static Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);

        int orderNumber = 0;
        while (orderNumber <= 0) {
            System.out.print("Order number: ");
            if (scanner.hasNextInt()) {
                orderNumber = scanner.nextInt();
                if (orderNumber <= 0) {
                    System.out.println("Order number must be a positive integer. Please try again!");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive integer for the order number.");
                scanner.next(); 
            }
        }

        scanner.nextLine(); 

        String customerName = "";
        while (customerName.isEmpty()) {
            System.out.print("Customer name: ");
            customerName = scanner.nextLine();
            if (customerName.isEmpty()) {
                System.out.println("Customer name cannot be empty. Please try again!");
            }
        }

        String contactNumber = "";
        while (contactNumber.isEmpty()) {
            System.out.print("Contact number: ");
            contactNumber = scanner.nextLine();
            if (contactNumber.isEmpty()) {
                System.out.println("Contact number cannot be empty. Please try again!");
            }
        }

        String address = "";
        while (address.isEmpty()) {
            System.out.print("Address: ");
            address = scanner.nextLine();
            if (address.isEmpty()) {
                System.out.println("Address cannot be empty. Please try again!");
            }
        }

        String location = "";
        while (location.isEmpty()) {
            System.out.print("Location: ");
            location = scanner.nextLine();
            if (location.isEmpty()) {
                System.out.println("Location cannot be empty. Please try again!");
            }
        }

        String emailAddress = "";
        while (emailAddress.isEmpty()) {
            System.out.print("Email address: ");
            emailAddress = scanner.nextLine();
            if (emailAddress.isEmpty()) {
                System.out.println("Email address cannot be empty. Please try again!");
            }
        }

        int numMeals = 0;
        while (numMeals <= 0) {
            System.out.print("Number of meals ordered: ");
            if (scanner.hasNextInt()) {
                numMeals = scanner.nextInt();
                if (numMeals <= 0) {
                    System.out.println("Number of meals must be a positive integer. Please try again!");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer for the number of meals!");
                scanner.next(); 
            }
        }

        scanner.nextLine(); 

        String[] mealsOrdered = new String[numMeals];
        double[] mealPrices = new double[numMeals];
        double totalAmount = 0.0;

        for (int i = 0; i < numMeals; i++) {
            System.out.print("Meal " + (i + 1) + ": ");
            mealsOrdered[i] = scanner.nextLine();

            double mealPrice = 0.0;
            while (mealPrice <= 0) {
                System.out.print("Price: ");
                if (scanner.hasNextDouble()) {
                    mealPrice = scanner.nextDouble();
                    if (mealPrice <= 0) {
                        System.out.println("Price must be a positive number. Please try again!");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive number for the price!");
                    scanner.next(); 
                }
            }

            scanner.nextLine(); 

            mealPrices[i] = mealPrice;
            totalAmount += mealPrices[i];
        }

        System.out.print("Special instructions: ");
        String specialInstructions = scanner.nextLine();
        

        return new Customer(
                orderNumber,
                customerName,
                contactNumber,
                address,
                location,
                emailAddress,
                mealsOrdered,
                mealPrices,
                specialInstructions,
                totalAmount);
    }

}

