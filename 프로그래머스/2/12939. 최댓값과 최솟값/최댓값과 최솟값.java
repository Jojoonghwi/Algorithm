import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrS = s.split(" ");

        int [ ] arrInt = Arrays.stream(arrS).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arrInt);

        return answer = arrInt[0] + " " + arrInt[arrInt.length - 1];
    }
}