package edu.kis.vh.nursery;

public class DefaultRhymer {

    private static final int NEW_TOTAL = -1;
    private static final int NUMBERS_AMOUNT = 12;
    private static final int IS_FULL = 11;
    private final int[] numbers = new int[NUMBERS_AMOUNT];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return getTotal() == NEW_TOTAL;
    }

    boolean isFull() {
        return getTotal() == IS_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEW_TOTAL;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEW_TOTAL;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
