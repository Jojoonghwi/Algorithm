#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    for(int i=0; i<10; i++) {
        answer += n%10;
        
        n /= 10;
    }
    return answer;
}