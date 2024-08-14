package lesson53;

import java.util.concurrent.Callable;

public class MyScondThread implements Callable<String> {
    @Override
    public String call(){
        return Thread.currentThread().getName();
    }
}
