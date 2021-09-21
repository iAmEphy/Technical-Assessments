// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 5){
            //check the length of array
            return -1;

        }
        //assign to variable
        int number = Integer.MAX_VALUE;

        //two loops. inside if number > 2 chains then assign iTH + jTH to number
        for(int i = 1; i < A.length - 3; i++){

            for(int j = i + 2; j < A.length - 1; j++){

                 if(number > (A[i] + A[j])){

                    number = A[i] + A[j];
                    
                 }
            }
        
        }
    return number;
        
    }
}

