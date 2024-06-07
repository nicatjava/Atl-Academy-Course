package lesson8;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Qarpızların sayı
        int n = scanner.nextInt();

        // Əgər qarpızların sayı 1 və ya 0-dırsa, "Ooops!" çap edir
        if (n <= 1) {
            System.out.println("Ooops!");
            return;
        }

        // Qarpızların çəkiləri
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        // Ən yüngül və ən ağır qarpızlar
        int minWeight = Integer.MAX_VALUE;
        int maxWeight = Integer.MIN_VALUE;

        // Qarpızların çəkilərini yoxlayır
        for (int weight : weights) {
            if (weight < minWeight) {
                minWeight = weight;
            }
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }

        // Nəticəni çap edir
        System.out.println(minWeight + " " + maxWeight);
    }
}
