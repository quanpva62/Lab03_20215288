package hust.soict.dsai.garbage;

import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            sb.append(random.nextInt(10));
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + "ms");
    }
}
