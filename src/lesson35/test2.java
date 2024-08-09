package lesson35;

import java.util.TreeSet;

public class test2 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("Jane",25));
        ts.add(new Person("Jack",17));
        ts.add(new Person("Jill",27));
        ts.add(new Person("Jill",15));
        ts.add(new Person("Jill",21));

        System.out.println(ts);
    }
}
