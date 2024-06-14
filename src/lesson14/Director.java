package lesson14;

public class Director extends Manager{
    double bonus;

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    public Director(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department, departmentManaged);
    }

    @Override
    public void work() {
        System.out.println("Director is working");
        manage();
    }

    @Override
    public void manage() {
        System.out.println("Director manages whole company");
        makeStrategicPlan();
    }
    public void makeStrategicPlan(){
        System.out.println("Director makes plan for managing whole company against attackers");
    }

    @Override
    public double calculateSalary() {
        return year*BASE_SALARY + MANAGEMENT_PAYMENT +bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Special bonus:" +bonus);
    }
}