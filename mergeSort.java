import java.util.Arrays;


public class mergeSorts
{
    public static void main(String[] args) 
    {
        //create random array
        int[] arr = {1,8,2,5,3,4,10,6,2,2,7,9}; 
        System.out.println(Arrays.toString(mergeSort(arr));
        System.out.println(mergeSort(arr).toString());
    }
    
    public static int[] mergeSort(int a[])
    {
        //define start mid end
        int start = a[0], end = a[a.length];
        int mid = (start + end) / 2;
        
        //create new arrays from left and right half
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, end);

        //recursivley split the arrays into smaller lefts and rights
        left = mergeSort(left);
        right = mergeSort(right);

        //rebuiling array
        int[] arr = new int[left.length + right.length];
        int l=0,r=0,i=0;

        while(true)
        {
            if()
        }

    }
}