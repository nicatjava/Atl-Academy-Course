package lesson16;

public class Car {
    public static int price;
    public int size;
    public static void show(){
        System.out.println("Showed!");
    }
    public void start(){
        System.out.println("Started");
        show();
    }
}
