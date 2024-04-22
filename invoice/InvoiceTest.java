package javaaassign1;

public class InvoiceTest {
    public static void main(String[] args)
     {
        //invoice object
        Invoice invoice = new Invoice("1001", "Battery", 3, 10.95);
//print invoice details
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity of purchased: " + invoice.getQuantityOfPurchased());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        invoice.setQuantityOfPurchased(3);
        invoice.setPricePerItem(11.99);

        System.out.println("Updated quantity of purchased: " + invoice.getQuantityOfPurchased());
        System.out.println("Updated price per item: " + invoice.getPricePerItem());
        System.out.println("Updated invoice amount: " + invoice.getInvoiceAmount());
    }
}
