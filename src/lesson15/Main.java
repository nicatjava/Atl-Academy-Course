package lesson15;

public class Main {
    public static void main(String[] args) {
//        Swimmer s = new Swimmer();
//        s.run();
//        Athlete a = new Swimmer();
//        a.run();
//        System.out.println(a.x );
        Athlete athlete =  new Greppler(); // upcasting polymorphism
        Swimmer runner = (Swimmer) athlete; // downcasting
        runner.run();
    }
}
