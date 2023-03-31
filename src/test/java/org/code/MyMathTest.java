package org.code;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMathTest {
    private MyMath myMath = new MyMath();

    @BeforeAll
    public static void atFirst() {
        System.out.println("Before testing...");
    }

    @AfterAll
    public static void atLast() {
        System.out.println("After testing...");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each...");
    }

    @Test
    public void calculateSumSevenMemberArray() {
        System.out.println("Test1");
        assertEquals(28, myMath.calculateSum(new int[]{1, 2, 3, 4, 5, 6, 7}));
        int[] array = new int[]{1, 2};
        assertTrue(Arrays.equals(array, new int[]{1, 2}));
    }

    @Test
    public void calculateSumZeroMemberArray() {
        System.out.println("Test2");
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }

    @Test
    public void twoEqualArrays() {
        System.out.println("Test3");
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2, 3};
        assertTrue(Arrays.equals(array1, array2));
    }
}