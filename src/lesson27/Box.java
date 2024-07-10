package lesson27;

public class Box <T>{
    private T key;
    private boolean value;
    public Box(T key, boolean value){
        this.key = key;
        this.value = value;
    }

    public void setKey(T key) {
        this.key = key;
    }
    public void setValue(boolean value) {
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box [key=" + key + ", value=" + value + "]";
    }
}
