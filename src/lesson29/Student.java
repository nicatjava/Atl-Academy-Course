package lesson29;

public class Student implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
        if(this.name == o.name){
            return Double.compare(this.grade, o.grade);
        }
        if(this.grade == o.grade){
            return Integer.compare(this.age, o.age);
        }
        return Double.compare(this.grade, o.grade);
    }

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}
