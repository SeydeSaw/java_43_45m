package algorithms.hw.hw_22_03_23;
/*  TODO: 28.03.23
        Даны два целых числа x и n, напишите функцию для вычисления x^n
        решение 1 - рекурсивно O(n)
        решение 2 - улучшить решение 1 до O(lon n)
 */
public class CalcPower {
    // Рекурсивное решение
    public static int powerRecursive(int x, int n) {
        // Если n = 0, то возвращаем 1
        if (n == 0) {
            return 1;
        }
        // Иначе возвращаем x, умноженное на результат вызова функции с уменьшенным значением n
        return x * powerRecursive(x, n - 1);
    }

    // Улучшенное решение
    public static int powerImproved(int x, int n) {
        // Базовый случай, если n = 0, то возвращаем 1
        if (n == 0) {
            return 1;
        }
        // Если n нечетное, то вычисляем x^n равное x * x^(n-1)
        if (n % 2 != 0) {
            return x * powerImproved(x, n - 1);
        }
        // Если n четное, то сначала вычисляем x^(n/2) и умножаем его на себя
        int y = powerImproved(x, n / 2);
        return y * y;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 8;

        // Выводим на печать результаты двух методов
        System.out.println(powerRecursive(x, n));
        System.out.println(powerImproved(x, n));
    }
}