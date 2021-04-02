package leetcode.eip;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import leetcode.eip.ArrayFunc;

public class ArrayFuncTest {

    private ArrayFunc arrayFunc;
    @BeforeEach
    public void setUp() throws Exception {
        arrayFunc = new ArrayFunc();
    }

    @Test
    @DisplayName("ArrayFunc Test 1.")
    public void test() {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] expected = { 4, 2, 3, 5, 1 };
        arrayFunc.evenOdd(A);
        assertEquals(true, Arrays.equals(A, expected));
    }
}