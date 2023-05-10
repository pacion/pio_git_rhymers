package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        DefaultRhymer[] rhymers = getDefaultRhymers(factory);

        countInRhymers(rhymers);

        countInWithRandomValues(rhymers);

        printCountOut(rhymers);

        printTotalRejectedCounter(rhymers);
    }

    private static void printTotalRejectedCounter(DefaultRhymer[] rhymers) {
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

    private static void printCountOut(DefaultRhymer[] rhymers) {
        for (DefaultRhymer rhymer : rhymers) {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        }
    }

    private static void countInWithRandomValues(DefaultRhymer[] rhymers) {
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
    }

    private static void countInRhymers(DefaultRhymer[] rhymers) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

    private static DefaultRhymer[] getDefaultRhymers(Rhymersfactory factory) {
        DefaultRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};
        return rhymers;
    }

}