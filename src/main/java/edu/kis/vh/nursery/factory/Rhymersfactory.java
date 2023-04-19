package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;

public interface Rhymersfactory {

    public DefaultRhymer getStandardRhymer();

    public DefaultRhymer getFalseRhymer();

    public DefaultRhymer getFIFORhymer();

    public DefaultRhymer getHanoiRhymer();

}
