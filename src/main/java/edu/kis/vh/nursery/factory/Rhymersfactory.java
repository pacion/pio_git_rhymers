package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;

public interface Rhymersfactory {

    DefaultRhymer getStandardRhymer();

    DefaultRhymer getFalseRhymer();

    DefaultRhymer getFIFORhymer();

    DefaultRhymer getHanoiRhymer();
}
