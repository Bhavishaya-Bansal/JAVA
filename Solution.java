public class Solution {
    public static String print(int n){
    if(n < 0){
        return "nzxd";
    }
    if(n == 0){
        System.out.println(n);
        return "no";
    }
    print(n--);
    String alpha = (n+" ");
    return(alpha);
}

    public static void main(String[] args) {
        int num = 3;
        print(num);
    }}