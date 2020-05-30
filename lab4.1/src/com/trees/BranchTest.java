package com.trees;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BranchTest {

    @Test
    void testToString() {
        Branch branch1 = new Branch("green", 10,15);
        String expected = branch1.toString();
        String actual = branch1.toString();
        Assert.assertEquals(expected, actual);
    }
}