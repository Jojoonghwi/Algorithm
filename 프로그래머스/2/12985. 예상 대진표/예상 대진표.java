import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        int count = 1;
        double tonamentCount = 0;
        List<Integer> tonament = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tonament.add(i + 1);
        }
        //반으로 나눴을 떄 두 수가 다른 곳에 있는 경우
        while (tonament.size() > Math.pow(2.0, tonamentCount)) {
            if ((tonament.size() / 2 >= a && tonament.size() / 2 < b) || (tonament.size() / 2 < a && tonament.size() / 2 >= b)) {
                while (count < tonament.size()) {
                    count *= 2;
                    tonamentCount++;
                }

            }
            //반으로 나눴을 떄 두 수가 작은 곳에 있는 경우
            else if (tonament.size() / 2 < a && tonament.size() / 2 < b) {
                tonament.subList(0, tonament.size() / 2).clear();
                a -= tonament.size();
                b -= tonament.size();
            }
            //반으로 나눴을 떄 두 수가 큰 곳에 있는 경우
            else if (tonament.size() / 2 >= a && tonament.size() / 2 >= b) {
                tonament.subList(tonament.size() / 2, tonament.size()).clear();
            }
        }

        return (int) tonamentCount;
    }
}
