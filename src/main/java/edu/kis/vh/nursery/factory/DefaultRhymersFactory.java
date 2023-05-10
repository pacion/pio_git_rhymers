package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultRhymer getStandardRhymer() {
        return new DefaultRhymer();
    }

    @Override
    public DefaultRhymer getFalseRhymer() {
        return new DefaultRhymer();
    }

    @Override
    public DefaultRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}
