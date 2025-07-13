import java.util.*;
public class Leetcode2410 {
    public static void main(String[] args) {
        System.out.println(matchPlayersAndTrainers(new int[]{4,7,9},new int[]{8,2,5,8}));
    }
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0;
        int j=0;
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;j++;
            }
            else {
                j++;
            }
        }
        return count;
    }
}
