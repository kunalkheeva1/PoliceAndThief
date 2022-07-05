import java.util.ArrayList;

public class PoliceAndThief {
    public static int policeAndThief(char [] arr, int n, int k){
        ArrayList<Integer> thief = new ArrayList<>();
        ArrayList<Integer> police = new ArrayList<>();

        for(int i= 0; i<n; i++){
            if(arr[i]=='T'){
                thief.add(i);
            }else{
                police.add(i);
            }
        }
        int i =0, j=0, count=0;

        while (i<thief.size() && j< police.size()){
            int difference = Math.abs(thief.get(i)- police.get(j));
            if(difference<=k){
                i++;
                j++;
                count++;
            }
            else if(thief.get(i)<police.get(j)){
                i++;
            }else if(thief.get(i)<police.get(j)){
                j++;
            }
        }return count;
    }


    public static void main(String[] args) {

    }
}
