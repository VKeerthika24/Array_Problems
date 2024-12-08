import java.util.*;
public class Occurence_of_array {
    public static void main(String[] args) {
        int arr[]={1,1,1,4,4,2,2,5,5,3,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int num:map.keySet())
        {
            System.out.println(num+" :"+map.get(num));
        }

    }
}
