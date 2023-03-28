package lessons.lesson_16_03_23.comparable;

class PairString implements Comparable<PairString> {

    private String ourString1;
    private String ourString2;

    public PairString(String ourString1, String ourString2) {
        this.ourString1 = ourString1;
        this.ourString2 = ourString2;
    }

    @Override
    public String toString() {
        return "(" + ourString1 + "," + ourString2 + ")";
    }

    @Override
    public int compareTo(PairString pair) {
        int resultFirstCompare = ourString1.compareTo(pair.getOurString1());
        if (resultFirstCompare != 0){
            return resultFirstCompare;
        } else {
            int resultSecondCompare = ourString2.compareTo(pair.getOurString2());
            return resultSecondCompare;
        }
    }

    public String getOurString1() {
        return ourString1;
    }

    public String getOurString2() {
        return ourString2;
    }
}