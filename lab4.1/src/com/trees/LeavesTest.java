package com.trees;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LeavesTest {

    @Test
    void getLeavesCount() {
        Leaves leave1 = new Leaves("green", 10);
        int actual = leave1.getLeavesCount();
        Assert.assertEquals(10, actual);
    }

    @Test
    void getColor() {
        Leaves leave1 = new Leaves("green", 10);
        Leaves leave2 = new Leaves("yellow", 10);
        Leaves leave3 = new Leaves("orange", 10);
        List<String> expected = new ArrayList<>();
        expected.add("green");
        expected.add("yellow");
        expected.add("orange");
        List<String> actual = new ArrayList<>();
        actual.add(leave1.getColor());
        actual.add(leave2.getColor());
        actual.add(leave3.getColor());
        Assert.assertEquals(expected, actual);
    }
}
