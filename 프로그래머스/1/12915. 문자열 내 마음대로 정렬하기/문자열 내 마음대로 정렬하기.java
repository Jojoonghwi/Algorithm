class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        String tmp="";
        
        for(int i=0; i<strings.length-1; i++) {
            for(int j=i+1; j<strings.length; j++) {
                if(strings[i].charAt(n) > strings[j].charAt(n)) {
                    tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
                
                else if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }

                }
            }
        }
        
        return answer = strings;
    }
}