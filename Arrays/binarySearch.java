import java.util.*;
public class binarySearch {
    public static boolean binary(int[] arr, int n,int t){
        int s=0,e=n-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==t)
                return true;
            else if(t<arr[mid])
                e=mid-1;
            else
                s=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,4,5,6,7,8,9};
        int n=arr.length;
        int t=sc.nextInt();
        System.out.println(binary(arr,n,t));
        sc.close();
    }
}
