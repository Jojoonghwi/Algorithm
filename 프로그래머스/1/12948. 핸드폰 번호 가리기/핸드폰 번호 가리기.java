class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] int_number = phone_number.toCharArray();
        for(int i=0; i<int_number.length-4; i++) {
            int_number[i] = '*';
        }
        
        answer = new String(int_number);
        return answer;
    }
}