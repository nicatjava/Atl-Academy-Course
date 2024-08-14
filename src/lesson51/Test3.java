package lesson51;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Fred", "IT", 60000.0));
        employees.add(new Employee("John", "HR", 45000.00));
        employees.add(new Employee("Clara", "IT", 32000.00));
        employees.add(new Employee("Aiman", "IT", 57000.00));
        employees.add(new Employee("Tom", "FINANCE", 25000.00));

        List<String> listOver50000 = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 50000)
                .map(employee -> employee.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(listOver50000);


        Double avarageSalary = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .mapToDouble(employee -> employee.getSalary())
                .average()
                .orElse(0.0);

        System.out.println(avarageSalary);
    }
}
