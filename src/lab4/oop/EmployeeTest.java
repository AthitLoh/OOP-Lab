package lab4.oop;

public class EmployeeTest {

    public static void main(String [] args){
        Employee emp1 = new Employee("Athittaya","Saeloh", 30000);
        Employee emp2 = new Employee("Mook","Loh", 25000);

        System.out.println(emp1.getMonthlySalary());
        System.out.println(emp2.getMonthlySalary());

        System.out.println(emp1.setYearlySalary(10));
        System.out.println(emp2.setYearlySalary(10));

    }
}
