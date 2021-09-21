// you can also use imports, for example:
// import java.util.*;
import java.util.*;
import java.lang.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args){
        String[] array = {"codility1", "codility3", "codility2", "codility4b", "codility4a"};
        String[] answer = {"Wrong answer", "Ok", "Runtime error", "Time limit exceeded"};

        System.out.println(solution(array, answer));

        
        
    }

    static Map<String, List<String>> hashmap = new HashMap<>();
    static int count = 0;
    static Map<String, String> anotherMap = new HashMap<>();
    public static int solution(String[] T, String[] R) {
        // write your code in Java SE 8
        int score = 0;
        int index = -1;
        
        for(int j = 0; j < T[0].length(); j++){
            char c = T[0].charAt(j);

            if(!Character.isDigit(c)){
                continue;
            }

            index = j + 1;
            break;

        }


        for(int i = 0; i < T.length; i++){
            String x = T[i].substring(0, index);

            String y = R[i].toUpperCase();

            if(!hashmap.containsKey(x) && !anotherMap.containsKey(x)){
                anotherMap.put(x, null);
                count++;

                if(y.equals("OK")){
                    hashmap.put(x, new ArrayList<>());
                }
            }

            else{
                if(hashmap.containsKey(x) && !y.equals("OK")){
                    hashmap.remove(x);
                }
            }
            
        }

        
        return hashmap.size() * 100 / count;
    }
}
