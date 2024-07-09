import java.util.Scanner;
import java.util.Arrays;

public class Firstmax_min {
    public static void main (String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int l=0,r=arr.length-1,ind=0;
        int[]res = new int[arr.length];
        while(l<=r) {
            if(l!=r) {
                res[ind]=arr[r];
                ind++;r--;
            }
            res[ind]=arr[l];
            ind++;
            l++;
        }
        System.out.println(Arrays.toString(res));
    }
}
