package lesson27;

public class Result <T>{
    private T t;
    private String className;

    public Result(T t, String text){
        this.t = t;
        this.className = text;
    }
    public Result(){

    }

    public Result(T t){
        this.t = t;
    }

    public T getResult(){
        return t;
    }
    public String getText(){
        return className;
    }

    @Override
    public String toString() {
        return "Result{" +
                "t=" + t +
                ", className='" + className + '\'' +
                '}';
    }
}
