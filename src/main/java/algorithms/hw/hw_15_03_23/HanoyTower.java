package algorithms.hw.hw_15_03_23;

import java.util.Stack;

public class HanoyTower {
    public static void main(String[] args) {

        Stack<Integer> leftStick = new Stack<>();
        Stack<Integer> middleStick = new Stack<>();
        Stack<Integer> rightStick = new Stack<>();

        int numberDisks = 8;

        for (int i = numberDisks; i > 0; i--) {
            leftStick.push(i);
        }

        moveDisks(numberDisks, leftStick, middleStick, rightStick);
        System.out.println("Диски перемещены с левого стержня на правый");
    }

    public static void moveDisks(int n, Stack<Integer> leftStick, Stack<Integer> middleStick, Stack<Integer> rightStick) {
        if (n > 0) {
            moveDisks(n - 1, leftStick, rightStick, middleStick);
            //moveDisks(leftStick, rightStick, to, from);
        }
    }

    static class Tower {
        private Stack<Integer> disks;
        private String name;

        public Tower(String name) {
            this.name = name;
            disks = new Stack<>();
        }

        public void add(int disk) {
            if (!disks.isEmpty() && disks.peek() <= disk) {
                System.out.println("Error placing disk " + disk);
            } else {
                disks.push(disk);
            }
        }

        public int pop() {
            return disks.pop();
        }

        public String toString() {
            return name + " " + disks.toString();
        }
    }
}