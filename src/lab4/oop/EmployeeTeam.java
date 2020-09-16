package lab4.oop;

public class EmployeeTeam {
    //Attributes
    private Employee boss;
    private Employee employee;

    // Constructor
    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    //Methods
    public void printEmployeeDetails(){
        System.out.println(employee.getFirstName()+" "+employee.getLastName()+" "+employee.getMonthlySalary());
    }

    public void printAllEmployeesDetails(){
        System.out.println(boss.getFirstName()+" "+boss.getLastName()+" "+boss.getMonthlySalary());
        System.out.println(employee.getFirstName()+" "+employee.getLastName()+" "+employee.getMonthlySalary());

    }

    
}
