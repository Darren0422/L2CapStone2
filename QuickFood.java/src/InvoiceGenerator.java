public class InvoiceGenerator {

    // Driver Selection:
    // I asked my friend for advice on how to code this driver selection for
    // deliveries.
    // The selected driver is set to null and the minimum deliveries are set to the
    // biggest possible number.
    // An ehnaced for loop iterates over the driver array.
    // An if statement checks if the driver is not null and if their location
    // matches the customer's location.
    // If both conditions are true, another if statement checks if the current
    // driver's deliveries are less than the minimum number of deliveries. If so,
    // the driver and the min deliveries number are updated.
    // The selected driver is returned.
    public static Driver selectDriver(Driver[] drivers, String customerLocation) {
        Driver selectedDriver = null;
        int minDeliveries = Integer.MAX_VALUE;

        for (Driver driver : drivers) {
            if (driver != null && driver.getDriverLocation().equalsIgnoreCase(customerLocation)) {
                if (driver.getDeliveries() < minDeliveries) {
                    selectedDriver = driver;
                    minDeliveries = driver.getDeliveries();
                }
            }
        }

        return selectedDriver;
    }

    // Generate Invoice as string:
    // The template I used for this invoice is at the bottom of the code.
    // A StringBuilder is created and the various inputs from the user are added
    // using the get methods mentioned above.
    // New lines are used to format the invoice and make it more readable.
    // A for loop is used to iterate over the meals ordered and adds them with their
    // prices to the invoice string.
    // The driver is selected using the selectDriver method to assign it based on
    // location. If no driver is in the area, then the customer is informed.
    // The StringBuilder is converted to a string at the end.
    public String generateInvoice(Driver[] drivers, Customer customer, Restaurant restaurant) {
        StringBuilder invoiceBuilder = new StringBuilder();

        invoiceBuilder.append("***INVOICE*** ").append("").append("\n");
        invoiceBuilder.append("Order number: ").append(customer.getOrderNumber()).append("\n");
        invoiceBuilder.append("Customer: ").append(customer.getCustomerName()).append("\n");
        invoiceBuilder.append("Email: ").append(customer.getEmailAddress()).append("\n");
        invoiceBuilder.append("Phone number: ").append(customer.getContactNumber()).append("\n");
        invoiceBuilder.append("Location: ").append(customer.getLocation()).append("\n\n");

        invoiceBuilder.append("You have ordered the following from ")
                .append(restaurant.getRestaurantName())
                .append(" in ")
                .append(restaurant.getRestaurantLocation())
                .append(":\n\n");

        String[] mealsOrdered = customer.getMealsOrdered();
        double[] mealPrices = customer.getMealPrices();

        for (int i = 0; i < mealsOrdered.length; i++) {
            invoiceBuilder.append(mealsOrdered[i])
                    .append(" (R")
                    .append(mealPrices[i])
                    .append(")\n");
        }

        invoiceBuilder.append("\n");
        invoiceBuilder.append("Special instructions: ").append(customer.getSpecialInstructions()).append("\n\n");
        invoiceBuilder.append("Total: R").append(customer.getTotalAmount()).append("\n\n");

        Driver selectedDriver = selectDriver(drivers, customer.getLocation());
        if (selectedDriver == null) {
            invoiceBuilder
                    .append("Sorry! Our drivers are too far away from you to be able to deliver to your location.\n");
            return invoiceBuilder.toString();
        }

        invoiceBuilder.append(selectedDriver.getDriverName())
                .append(" is nearest to the restaurant and so he will be delivering your order to you at:\n\n");

        invoiceBuilder.append(customer.getAddress()).append("\n\n");

        invoiceBuilder.append("If you need to contact the restaurant, their number is ")
                .append(restaurant.getRestaurantContactNumber());

        return invoiceBuilder.toString();

    }
}
