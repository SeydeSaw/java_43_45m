package lesson_16_03_23.comparator;

class Pair {

    private String ourString;
    private int ourInteger;

    public Pair(String ourString, int ourInteger) {
        this.ourString = ourString;
        this.ourInteger = ourInteger;
    }

    @Override
    public String toString() {
        return "(" + ourString + "," + ourInteger + ")";
    }


    public String getOurString() {
        return ourString;
    }

    public int getOurInteger() {
        return ourInteger;
    }
}