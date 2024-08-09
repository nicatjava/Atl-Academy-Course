package lesson51;

import java.time.DateTimeException;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {

    }

    public static <E> E test(Collection<E> collection, E e) {
        E myE = collection.stream()
                .filter(c -> c.equals(e))
                .findFirst()
                .orElseThrow(() -> new DateTimeException("Data Not Found"));
        return myE;
    }


}
