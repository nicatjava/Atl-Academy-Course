package lesson20;

public class Pet {

    private Species animalType;
    private String nickname;
    private int age;
    private int trickLevel;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(Species animalType, String nickname, int age, int trickLevel) {
        this.animalType = animalType;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public Species getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Species animalType) {
        this.animalType = animalType;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    @Override
    public String toString() {
        return "Pet [animalType=" + animalType + ", nickname=" + nickname + ", age=" + age + ", trickLevel=" + trickLevel + "]";
    }
}

