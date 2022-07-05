import java.util.ArrayList;

public class PoliceAndThief {
    public static int policeAndThief(char [] arr, int n, int k){

        //get two lists to store the indexes of T and the P from the arr
        ArrayList<Integer> thief = new ArrayList<>();
        ArrayList<Integer> police = new ArrayList<>();

        for(int i= 0; i<n; i++){
            if(arr[i]=='T'){
                thief.add(i);
            }else{
                police.add(i);
            }
        }

        // now run  a loop until pointers meet the ends
        int i =0, j=0, count=0;

        while (i<thief.size() && j< police.size()){
            int difference = Math.abs(thief.get(i)- police.get(j));
            // if the distance is smaller and equal then move both pointers and count++
            if(difference<=k){
                i++;
                j++;
                count++;
            }
            // else whose index is small move that candidate to get the smaller difference or equal
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
