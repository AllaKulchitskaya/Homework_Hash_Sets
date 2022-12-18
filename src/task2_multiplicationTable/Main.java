package task2_multiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат задачи 2 (дз 3):");
        System.out.println();

        Set<MultiplicationTable> multiplicationTableSet = new HashSet<>();
        while (multiplicationTableSet.size() < 15) {
            MultiplicationTable question = new MultiplicationTable(nextInt(2, 10), nextInt(2, 10));
            multiplicationTableSet.add(question);
            System.out.println(question);
        }
    }

    private static int nextInt(int from, int to) {
        Random random = new Random();
        return Math.min(from, to) + random.nextInt(Math.abs(to - from));
    }
}
