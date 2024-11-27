import java.util.ArrayList;

import com.bhav.Searching.linearSearch;

class Practise{
    public static void main(String args[]){
        String str= "abc";
        ArrayList<String> ans= fun("", str);
        // fun("", str);
        
        System.out.println(ans.toString());
        
        // char ans= (arr, target);
    }
    public static ArrayList<String> fun(String p, String up){
        ArrayList<String> ans= new ArrayList<>();
        if(up.length()== 0){
            ans.add(p);
        }
        char ch= up.charAt(0);

        for(int i = 0; i<= p.length(); i++){
            ans.addAll(fun(p.substring(0, i)+ ch+ p.substring(i), up.substring(1)));
        }
        return ans;
    }

    
}