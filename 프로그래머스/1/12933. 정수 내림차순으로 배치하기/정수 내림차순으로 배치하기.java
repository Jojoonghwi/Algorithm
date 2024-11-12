class Solution {
    public long solution(long n) {
        long answer = 0;
        int length =0;
        char max;
        
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(arr[i] < arr[j]) {
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
        
        String tmp = "";
        for(int i=0; i<str.length(); i++) {
           tmp+=arr[i];
        }
        
        return answer = Long.parseLong(tmp);
    }
}