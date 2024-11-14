#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(long num) {
    long answer = 0;
    int n=500;
    if(num==1) {
        answer = 0;
       return answer; 
    }
    while(n>0) {
        if(num%2 == 0) {
            num/=2;
            answer++;
            n--;
        }
        else {
            num = num*3 +1;
            answer++;
            n--;
        }
        if(num==1) {
            break;
        }
    }
    if(n==0) {
        answer = -1;
    }
    
    return answer;
}