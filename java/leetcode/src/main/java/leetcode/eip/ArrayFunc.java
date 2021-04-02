package leetcode.eip;

public class ArrayFunc {

    /**
     * Given an array of integers, you have to reorder its entries
     * so that the even entries appear first.
     *
     * Solve it without allocating additional storage.
     *
     * input  [1, 2, 3, 4, 5]
     * output [4, 2, 3, 5, 1]
     *
     * Sample run of the 'evenOdd' algorithm:
     *
     * input  [1, 2, 3, 4, 5]
     *         ^           ^
     *         e           o    e: even, o: odd
     * input  [5, 2, 3, 4, 1]
     *         ^        ^
     *         e        o
     * input  [4, 2, 3, 5, 1]
     *         ^     ^
     *         e     o
     * input  [4, 2, 3, 5, 1]
     *            ^  ^
     *            e  o
     * input  [4, 2, 3, 5, 1]
     *               ^
     *              e,o
     */
    public void evenOdd(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                // swap elements
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
    }
}