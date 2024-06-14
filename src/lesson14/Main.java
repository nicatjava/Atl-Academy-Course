package lesson14;

class Main {


    public static void main(String[] args) {
        Employee e = new Employee(1, "Jack", 14, "Production");
        System.out.println("Salary" + e.calculateSalary());
        e.printInfo();

        System.out.println("------");


        Manager m = new Manager(2, "Arzu", 20, "IT", "IT");
        System.out.println("Salary" + m.calculateSalary());
        m.printInfo();

        System.out.println("------");

        Director d = new Director(3, "NUBAR", 25, "COMPANY", "COMPANY", 10000);
        System.out.println("Salary" + d.calculateSalary());
        d.printInfo();

        System.out.println("------");
    }

}