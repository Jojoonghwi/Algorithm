import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] max_w = new int[sizes.length];
        int[] max_h = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            max_w[i] = Math.max(sizes[i][0], sizes[i][1]);
            max_h[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        Arrays.sort(max_w);
        Arrays.sort(max_h);

        return max_w[sizes.length-1] * max_h[sizes.length-1];
    }
}