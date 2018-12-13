package random;

//algorithm based on Linear congruential generator using current time in milliseconds
public class CustomRandom {
    private int maxNumb;
    private int lastNumb;
    private int m = 65536;
    private int a = 32719;
    private int c = 3;

    //if not max number set max integer values as max number
    public CustomRandom() {
        this.maxNumb = Integer.MAX_VALUE;
        lastNumb = (int) (System.currentTimeMillis() % maxNumb);
    }

    public CustomRandom(int maxNumb) {
        this.maxNumb = maxNumb;
        lastNumb = (int) (System.currentTimeMillis() % maxNumb);
    }

    public int nextInt() {
        lastNumb = (lastNumb * a + c) % m;
        return lastNumb % maxNumb;
    }
}
