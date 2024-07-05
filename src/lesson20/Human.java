package lesson20;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int IQ;
    private Pet pet;
    private Human mother;
    private Human father;
    private DayOfWeek[] schedule = new DayOfWeek[7];

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

    public void fillSchedule(DayOfWeek day) {
        // Assuming only one slot per day for simplicity
        int index = day.ordinal(); // Get the index of the day in the enum
        schedule[index] = day;
    }

    public void printSchedule() {
        System.out.println("Schedule for " + name + " " + surname + ":");
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i] != null) {
                System.out.println(schedule[i].name()); // Using name() method of enum
            }
        }
    }

    public void greetPet(){
        System.out.println("Hello, "+pet.getNickname());
    }

    public void describePet(){
        String msg = pet.getTrickLevel() == 50 ? "normal sly" : (pet.getTrickLevel()>50 ? "very sly": "almost not sly");
                System.out.println("I have a "+pet.getAnimalType()+", he is "+pet.getAge()+" years old, he is "+msg);
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", surname=" + surname + ", year=" + year + ", IQ=" + IQ + ", mother=" + mother.name + " " + mother.surname
                + ", father=" + father.name + " " + father.surname+ "] "+pet.toString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIQ() {
        return IQ;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
