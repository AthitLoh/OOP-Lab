package lab4.oop;

public class InvoiceTest {
    public static void main(String [] args){
        Invoice invoice = new Invoice("9949", "Cooking item", 8, 69.99);
        System.out.println(invoice.getNumber()+" "+invoice.getDescription()+" "+invoice.getQuantity()+" "+invoice.getPrice());
        System.out.println("This is the invoice: "+invoice.getInvoiceAmount());    
    }
}
