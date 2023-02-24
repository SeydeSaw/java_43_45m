package lesson_14_02_23;

public class InterfaceAbsExamples {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);
        System.out.println(calculator.sum());
    }
}

class Calculator extends AbsCalculator {

    Calculator(int a, int b) {
        super(a, b);
    }

    @Override
    int mult() {
        return getA() * getB();
    }

    @Override
    int subt() {
        return getA() - getB();
    }

    @Override
    int div() {
        return getA() / getB();
    }
}

abstract class AbsCalculator {

    private int a, b;

    AbsCalculator(int a) {
        this.a = a;
        this.b = 10;
    }

    AbsCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {
        return a + b;
    }

    abstract int mult();
    abstract int subt();
    abstract int div();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}