package edu.kis.vh.nursery;

public class DefaultRhymer {
    private static final int new_total = -1;
    private static final int twelve = 12;
    private static final int eleven = 11;
    private int[] numbers = new int[twelve];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == new_total;
    }

    public boolean isFull() {
        return total == eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return new_total;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return new_total;
        return numbers[total--];
    }

}
