#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    if(a>b) {
        for(int i=b; i<=a; i++) {
            answer += i;
        }
    }
    
    else if(a<b) {
        for(int j=a; j<=b; j++) {
            answer += j;
        }      
    }
    
    else {
        answer = (long)a;
    }
    return answer;
}