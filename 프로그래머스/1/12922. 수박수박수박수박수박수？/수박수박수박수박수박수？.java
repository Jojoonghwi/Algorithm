class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i%2 != 0) {
                answer = answer.append("박");
            }
            else {             
                answer = answer.append("수");
            }
            
        }
        return answer.toString();
    }
}