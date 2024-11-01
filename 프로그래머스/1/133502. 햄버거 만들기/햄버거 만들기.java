import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredientStack = new Stack<>();

        for(int i=0; i<ingredient.length; i++) {
            ingredientStack.push(ingredient[i]);
        

        if(ingredientStack.size() >= 4) {
            int size = ingredientStack.size();
            if(ingredientStack.get(size-4)==1 &&
                ingredientStack.get(size-3)==2 &&
                ingredientStack.get(size-2)==3 &&
                ingredientStack.get(size-1)==1) {
                
                            ingredientStack.pop();
            ingredientStack.pop();
            ingredientStack.pop();
            ingredientStack.pop();
                
                 answer++;

            }


           
        }
        }

        return answer;
    }
}