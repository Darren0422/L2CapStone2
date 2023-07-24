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
    // A for loop is used to determine the total price of the food ordered.
    // It iterates the number of meals. The user is prompted to enter the amount of
    // meals ordered and then the price for each meal. These are stored and then the
    // prices of the meals are added to the total amount.
    // The "return new Customer" part creates a new customer object using the
    // information provided.

    //I could not get the program to fuction properly when i closed the scaner. 
    //I tried the work arouds but they still were ot working. I came across a form that said you ca remove it ad it solved the problem but I couldny get it to work.
    public static Customer createCustomer() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Order number: ");
        int orderNumber = scanner1.nextInt();
        scanner1.nextLine();

        System.out.print("Customer name: ");
        String customerName = scanner1.nextLine();

        System.out.print("Contact number: ");
        String contactNumber = scanner1.nextLine();

        System.out.print("Address: ");
        String address = scanner1.nextLine();

        System.out.print("Location: ");
        String location = scanner1.nextLine();

        System.out.print("Email address: ");
        String emailAddress = scanner1.nextLine();

        System.out.print("Number of meals ordered: ");
        int numMeals = scanner1.nextInt();
        scanner1.nextLine();

        String[] mealsOrdered = new String[numMeals];
        double[] mealPrices = new double[numMeals];
        double totalAmount = 0.0;

        for (int i = 0; i < numMeals; i++) {
            System.out.print("Meal " + (i + 1) + ": ");
            mealsOrdered[i] = scanner1.nextLine();

            System.out.print("Price: ");
            mealPrices[i] = scanner1.nextDouble();
            scanner1.nextLine();

            totalAmount += mealPrices[i];
        }
        

        System.out.print("Special instructions: ");
        String specialInstructions = scanner1.nextLine();

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
