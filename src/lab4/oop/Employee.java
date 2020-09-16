package lab4.oop;

public class Employee {
    //Attribute 
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName){
        this(firstName, lastName, 0);
    }

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    //Methods
    public String setFirstName(String firstName){
        return this.firstName;
    }

    public String setLastName(String lastName){
        return this.lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }

    public double setYearlySalary(){
        return this.monthlySalary*12;
    }

    public double setYearlySalary(float percent){
        double newSalary = (this.monthlySalary*12)*percent/100;
        return (this.monthlySalary*12)+newSalary;
    }
}