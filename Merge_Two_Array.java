public class Merge_Two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int c[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            c[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            c[arr1.length+i]=arr2[i];
        }
        for (int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
