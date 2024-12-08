import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 1, 3, 5, 1,2,2,2,2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        int m=0;
        for(int a:map.keySet())
        {
            if(map.get(a)>max)
            {
                max=map.get(a);
                m=a;
            }
        }
        System.out.println(m);
    }
}
