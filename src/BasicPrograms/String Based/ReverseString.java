import java.util.*;

class ReverseString{
    public static String reverse(String str){
        if(str == null || str.isEmpty())
        return str;
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String str = "Souvik";
        String newstr = reverse(str);
        System.out.println(newstr);
    }
}