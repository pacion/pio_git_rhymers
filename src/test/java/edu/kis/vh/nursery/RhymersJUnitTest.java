package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void countInShouldInsertGivenValueOnStack() {
        DefaultRhymer rhymer = new DefaultRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void callCheckShouldReturnTrueWhenRhymerIsEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();

        boolean result = rhymer.callCheck();

        Assert.assertTrue(result);
    }

    @Test
    public void callCheckShouldReturnFalseWhenRhymerIsNotEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();

        rhymer.countIn(888);

        boolean result = rhymer.callCheck();

        Assert.assertFalse(result);
    }

    @Test
    public void isFullShouldReturnFalseWhenRhymerIsNotFull() {
        DefaultRhymer rhymer = new DefaultRhymer();

        final int STACK_CAPACITY = 12;

        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }
    }

    @Test
    public void isFullShouldReturnTrueWhenRhymerIsNotFull() {
        DefaultRhymer rhymer = new DefaultRhymer();

        final int STACK_CAPACITY = 12;

        for (int i = 0; i < STACK_CAPACITY; i++) {
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();

        Assert.assertTrue(result);
    }

    @Test
    public void peekabooShouldReturnEmptyStackValueWhenRhymerIsEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();

        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();

        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void peekabooShouldReturnLastInsertedValueWhenRhymerIsNotEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void peekabooShouldNotRemoveLastInsertedValue() {
        DefaultRhymer rhymer = new DefaultRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void countOutShouldReturnEmptyStackValueWhenRhymerIsEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void countOutShouldReturnLastInsertedValueWhenRhymerIsNotEmpty() {
        DefaultRhymer rhymer = new DefaultRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void countOutShouldReturnEmptyStackValueWhenRhymerIsEmptiedAgain() {
        DefaultRhymer rhymer = new DefaultRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int testValue = 4;
        rhymer.countIn(testValue);

        rhymer.countOut();
        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void hanoiRhymerCountInShouldNotBeRejectedWhenValuesAreInsertedInDescendingOrder() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(2);

        int result = rhymer.reportRejected();
        Assert.assertEquals(0, result);

        rhymer.countIn(1);
        result = rhymer.reportRejected();
        Assert.assertEquals(0, result);
    }

    @Test
    public void hanoiRhymerCountInShouldBeRejectedWhenValuesAreInsertedInAscendingOrder() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(1);

        int result = rhymer.reportRejected();
        Assert.assertEquals(0, result);

        rhymer.countIn(2);
        result = rhymer.reportRejected();
        Assert.assertEquals(1, result);
    }

    @Test
    public void hanoiRhymerCountInShouldAllowToInsertValuesUsingHanoiAlgorithm() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(1);

        int result = rhymer.reportRejected();
        Assert.assertEquals(0, result);

        rhymer.countIn(2);
        result = rhymer.reportRejected();
        Assert.assertEquals(1, result);

        int previousValue = rhymer.countOut();
        rhymer.countIn(2);
        rhymer.countIn(previousValue);
        Assert.assertEquals(1, result);
    }
}