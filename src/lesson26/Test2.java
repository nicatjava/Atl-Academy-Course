package lesson26;

public class Test2 {
    public static void main(String[] args) {

    }

    public static boolean check(Object[] a, Object x) {
        for (Object obj : a) {
            if (x.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
