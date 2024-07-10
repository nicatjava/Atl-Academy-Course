package lesson26;

public class Box<T> {
    private T t;
    public Box(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
