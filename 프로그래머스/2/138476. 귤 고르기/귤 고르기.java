import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public int solution(int k, int[] tangerine) {
		List<Integer> tangerineList = new ArrayList<>();
		int answer = 0;
		int[] tangerineNum = new int[10000001];

		for (int i = 0; i < tangerine.length; i++) {
			tangerineNum[tangerine[i]]++;
		}

		for (int i = 0; i < tangerineNum.length; i++) {
			if (tangerineNum[i] > 0) {
				tangerineList.add(tangerineNum[i]);
			}
		}

		tangerineList.sort(Collections.reverseOrder());

		int count=0;
		for (int i = 0; i < tangerineList.size(); i++) {
			count += tangerineList.get(i);
			answer++;
			if (count >= k) {
				break;
			}
		}
		return answer;
	}
}