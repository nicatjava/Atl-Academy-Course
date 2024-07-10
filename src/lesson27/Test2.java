package lesson27;

public class Test2 {
    public static void main(String[] args) {
        Result<Object> result = test(null);
        System.out.println(result);
        Result<Object> result2 = test(5);
        System.out.println(result2);
    }

    public static <T> Result<T> test(T t) {
        return  t == null ? new Result<>() : new Result<>(t,t.getClass().getName()) ;
    }
}
