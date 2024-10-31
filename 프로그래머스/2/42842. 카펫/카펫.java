class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        long min = Long.MAX_VALUE;
        int carpet = brown + yellow;
        for (int i = 1; i <= carpet / 2; i++) {
            if ((carpet % i == 0) && (i + (carpet / i) < min)) {
                if (((carpet / i) - 2) * (i - 2) == yellow) {
                    min = i + (carpet / i);
                    answer[0] = (carpet / i);
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}