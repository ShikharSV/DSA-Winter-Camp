import java.util.*;
public class subsetSum {
    public static ArrayList<ArrayList<Integer>> subset(int[]arr,int target){
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(subset(arr, target));
        sc.close();
    }
}
