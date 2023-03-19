package lesson_16_03_23.comparable;

class Pair implements Comparable<Pair> {

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

    @Override
    public int compareTo(Pair pair) {
        int resultFirstCompare = ourString.compareTo(pair.getOurString());
        if (resultFirstCompare != 0){
            return resultFirstCompare;
        } else {
            int resultSecondCompare = this.ourInteger - pair.getOurInteger();
            return resultSecondCompare;
        }

    }

    public String getOurString() {
        return ourString;
    }

    public int getOurInteger() {
        return ourInteger;
    }
}