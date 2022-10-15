import java.util.*;

class RemoveCertainCharacter{
    static String solve(String input) {
   
     StringBuilder answer = new StringBuilder("");
     for(int i=0 ; i<input.length(); i++){
         if(input.charAt(i)!='(' && input.charAt(i) != ')' )
            answer.append(input.charAt(i));
     }
     return answer.toString();
  }
    public static void main(String[] args){
         String input2 = "(((a-b))+c)";
         String xyz = solve(input2);
         System.out.println(xyz);
    }
}