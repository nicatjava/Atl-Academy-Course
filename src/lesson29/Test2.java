package lesson29;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("David", 20, 45.7),
                new Student("John", 22, 57.2),
                new Student("Mary", 27, 75.5),
                new Student("John", 24, 35.3),
                new Student("Jack", 22, 92.3),
        };

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, (o1, o2) -> {
            if(o1.getGrade() == o2.getGrade()){
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Double.compare(o2.getGrade(), o1.getGrade());
        });
        System.out.println(Arrays.toString(students));
        System.out.println("===========");
    }
}
