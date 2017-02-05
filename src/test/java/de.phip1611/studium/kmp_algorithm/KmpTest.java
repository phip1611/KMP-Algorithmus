package de.phip1611.studium.kmp_algorithm;

import org.junit.Assert;
import org.junit.Test;

public class KmpTest {

    @Test
    public void test1() {
        int[] expected = {-1, -1, -1, -1, -1};
        Assert.assertArrayEquals(expected, KMP.analyze("aaaaa"));
    }

    @Test
    public void test2() {
        int[] expected = {-1, 0, -1, 0, 2, -1};
        Assert.assertArrayEquals(expected, KMP.analyze("ababba"));
    }

    @Test
    public void test3() {
        int[] expected = {-1, 0, -1, 0, -1, 3, 0, 2};
        Assert.assertArrayEquals(expected, KMP.analyze("ababaabb"));
    }

    @Test
    public void test4() {
        int[] expected = {-1, 0, 0, -1, 0, 0, -1, 4};
        Assert.assertArrayEquals(expected, KMP.analyze("abbabbaa"));
    }
}
