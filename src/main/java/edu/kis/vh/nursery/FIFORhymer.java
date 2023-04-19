package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer defaultCountingOutRhymer = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            defaultCountingOutRhymer.countIn(super.countOut());

        int ret = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.callCheck())
            countIn(defaultCountingOutRhymer.countOut());

        return ret;
    }
}
