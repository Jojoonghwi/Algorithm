class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        if(arr.length == 4 || arr.length == 6 ) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] > '9' || arr[i] <'0') {
                    return answer = false;
                }
            }
            
            return answer = true;
        }
        else {
            return answer = false;
        }

    }
}