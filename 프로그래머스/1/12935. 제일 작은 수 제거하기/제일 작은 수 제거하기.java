import java.util.ArrayList;
class Solution {
  		public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (min != arr[i]) {
				arrayList.add(arr[i]);
			}
		}
		
		int[] answer = new int[arrayList.size()];

		for (int j = 0; j < arrayList.size(); j++) {
			answer[j] = arrayList.get(j);
		}
		return answer;
	}
}