package edu.kis.vh.nursery;

/**
 * @brief fifo rhymer, first in first out
 */
public class FIFORhymer extends DefaultRhymer {

    public final DefaultRhymer defaultRhymer = new DefaultRhymer();

    /**
     * @brief count out from fifo rhymer and count in to default rhymer
     */
    @Override
    public int countOut() {
        while (!callCheck())
            defaultRhymer.countIn(super.countOut());

        int ret = defaultRhymer.countOut();

        while (!defaultRhymer.callCheck())
            countIn(defaultRhymer.countOut());

        return ret;
    }
}
