public class Employees {
    private String name;
    private String ID;
    private double salary;

    public Employees(double salary){
        this.salary = salary;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public double getSalary() {
        return salary;
    }

    public void updateSalary(double amount) {
        if (this.salary + amount >= 0) {
            this.salary += amount;
        }
    }

    public void employeeinfo(){
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Salary: " + getSalary());
    }
}

class EmployeesDriver{
    public static void main(String[] args) {
        Employees e1 = new Employees(20000);
        e1.setName("Shyam");
        e1.setID("E101");
        e1.updateSalary(5000);
        e1.getSalary();

        e1.employeeinfo();
    }
}
