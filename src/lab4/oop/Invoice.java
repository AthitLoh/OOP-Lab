package lab4.oop;

public class Invoice {
    //Attribute
    private String number;
    private String description;
    private int quantity;
    private double price;

    //Constructor
    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber(){
        return this.number;
    }

    public String getDescription(){
        return this.description;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getInvoiceAmount(){
        if(this.quantity < 0){
            this.quantity = 0;
        }
        if(this.price < 0){
            this.price = 0.0f;
        }
        return this.quantity*this.price;
    }

}
