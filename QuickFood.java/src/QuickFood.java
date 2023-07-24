import java.io.FileNotFoundException;
import java.util.Formatter;

public class QuickFood {

    //The readDriversFile method is used to read the file and add to the drivers array
    //createCustomer method is used to create a customer object ad store it as the variable customer
    //createRestaurant method is used to create a restaurant object ad store it as the variable restaurant
    //invoiceGenerator object is created and the generateInvoice method is called to create a string variable called invoice
    //The invoice string is printed to the console
    //A formatter is created called invoice.txt and the format method writes the innvoice string to the file
    //A catch block is added for if the file is not found
    public static void main(String[] args) {
        try {
            Driver[] drivers = Driver.readDriversFile();

            Customer customer = Customer.createCustomer();

            Restaurant restaurant = Restaurant.createRestaurant();

            InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
            String invoice = invoiceGenerator.generateInvoice(drivers, customer, restaurant);
            System.out.println("");
            System.out.println(invoice);

            Formatter formatter = new Formatter("invoice.txt");
            formatter.format("%s", invoice);
            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found:");
        }

    }

}
