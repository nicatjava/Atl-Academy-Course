package lesson20;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("John","Smith",1957);

        father.fillSchedule(DayOfWeek.MONDAY);
        father.fillSchedule(DayOfWeek.WEDNESDAY);
        father.fillSchedule(DayOfWeek.FRIDAY);

        // Print father's schedule
        father.printSchedule();

        Human mother = new Human("Clara","Smith",1959);
        Familiy familiy = new Familiy(mother,father,3);
        Human child1 = new Human("Niko","Katare",1988);
        Human child2 = new Human("Tural","Katare",2001);
        Human child3 = new Human("Kady","Borges",1996);
        familiy.addChild(child1);
        familiy.addChild(child2);
        familiy.addChild(child3); //not add becouse only 2 children have
        familiy.printFamily();
        familiy.deleteChild(1);
        System.out.println("childCount: "+familiy.getCountChildren());
        familiy.printFamily();

    }
}
