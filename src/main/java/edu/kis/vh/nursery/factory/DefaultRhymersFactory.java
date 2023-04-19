package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultRhymer GetStandardRhymer() {
        return new DefaultRhymer();
    }

    @Override
    public DefaultRhymer GetFalseRhymer() {
        return new DefaultRhymer();
    }

    @Override
    public DefaultRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
