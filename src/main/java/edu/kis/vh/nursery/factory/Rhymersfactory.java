package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;

public interface Rhymersfactory {

    public DefaultRhymer GetStandardRhymer();

    public DefaultRhymer GetFalseRhymer();

    public DefaultRhymer GetFIFORhymer();

    public DefaultRhymer GetHanoiRhymer();

}
