import java.util.*;
public class practise {
    public static void main(String[] args){
        Set<Integer> hashset = new HashSet<Integer>();
        for(int num : nums){
            hashset.add(num);   
        }
        int longestStreak= 0;
        for(int num: nums){
            if(!hashset.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(hashset.contains(currentNum+1)){
                    currentNum +=1;
                    currentStreak +=1;

                }
                longestStreak =Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }


