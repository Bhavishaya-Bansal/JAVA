import java.util.*;
class Practise {
    public static void main(String args[]) {
        String s = "abab";
        boolean ans= repeatedSubstringPattern(s);
        System.out.println(ans);
    }

    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder ans= new StringBuilder();
        for(int i=0; i< s.length()/2; i++){
            ans.append(s.charAt(i));

            for(int j=i+1; j< s.length(); j= j+ans.length()){
                if(!ans.equals(s.substring(i, j))){
                    return false;
                }
            }
        }
        return true;
    }
}