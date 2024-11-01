import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -100;
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                } else if (reserve[i] - 1 == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                } else if (reserve[i] + 1 == lost[j]) {
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}