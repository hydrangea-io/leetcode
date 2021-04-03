package leetcode.problem;

public class LeetCode0733 {
    /**
     * @param image 2-D array of integers, each integer representing the pixel
     * value of the image (from 0 to 65535).
     * @param sr source row index
     * @param sc source column index
     * @param newColor new color
     *
     * Flood fill: consider the starting pixel, plus any pixels connected of the
     * same color, replace the color with new color.
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            dfs(image, sr, sc, color, newColor);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, color, newColor);
            if (c >= 1) dfs(image, r, c-1, color, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
        }
    }
}