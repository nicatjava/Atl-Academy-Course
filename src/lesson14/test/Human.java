package lesson14.test;

public class Human {
    String name;
    String surname;
    int year;
    int IQ;
    Pet pet;
    Human mother;
    Human father;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet(){
        System.out.println("Hello, "+pet.getNickname());
    }

    public void describePet(){
        String msg = pet.trickLevel == 50 ? "normal sly" : (pet.trickLevel>50 ? "very sly": "almost not sly");
                System.out.println("I have a "+pet.getSpecies()+", he is "+pet.age+" years old, he is "+msg);
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", surname=" + surname + ", year=" + year + ", IQ=" + IQ + ", mother=" + mother.name + " " + mother.surname
                + ", father=" + father.name + " " + father.surname+ "] "+pet.toString();
    }
}
