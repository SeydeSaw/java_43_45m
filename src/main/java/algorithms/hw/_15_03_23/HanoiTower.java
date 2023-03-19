package algorithms.hw._15_03_23;

import java.util.Stack;

public class HanoiTower {

    // Итеративно
    public static void moveDisksIterative(int n, char source, char destination, char spare) {
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем i-й диск с источника на назначение
            moveOneDisk(i, source, destination, spare);
        }
    }

    // Рекурсивно
    public static void moveDisksRecursive(int n, char source, char destination, char spare) {
        if (n == 0) {
            return;
        } else {
            // Перемещаем n-1 диск с источника на проходную
            moveDisksRecursive(n - 1, source, spare, destination);
            // Перемещаем n-й диск с источника на назначение
            moveOneDisk(n - 1, source, destination, spare);
            // Перемещаем n-1 диск с проходной на назначение
            moveDisksRecursive(n - 1, spare, destination, source);
        }
    }

    // Вспомогательный метод для перемещения одного диска
    private static void moveOneDisk(int n, char source, char destination, char spare) {
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Iterative approach:");
        moveDisksIterative(n, 'A', 'C', 'B');
        System.out.println("Recursive approach:");
        moveDisksRecursive(n, 'A', 'C', 'B');
    }
}