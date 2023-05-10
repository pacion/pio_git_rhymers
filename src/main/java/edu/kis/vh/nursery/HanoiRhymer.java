package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) { // TODO what is peekaboo()? change this method name to something more meaningful
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
