package lesson29;

public class Player implements Comparable<Player>{
    @Override
    public int compareTo(Player that) {
        if(that.score == this.score){
            return this.name.compareTo(that.name);
        }
        return Integer.compare(this.score, that.score);
    }

    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", score=" + score + "]";
    }
}
