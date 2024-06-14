package lesson14.test;

public class Main {
    public static void main(String[] args) {
        Human child = new Human("Stephan","Tyson",2005);
        Human mother = new Human("Clara","Diana",1957);
        Human father = new Human("Mike","Tyson",1966);
        child.pet = new Pet("Charly");
        child.mother = mother;
        child.father = father;
    }
}
