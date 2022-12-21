import java.util.Scanner;
public class freqBinary {
    public static int first(int[] arr,int num){
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(num>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int firstOcc=first(arr, num);
        int lastOcc=second(arr, num);
        System.out.println(firstOcc-lastOcc+1);
        sc.close();        
    }
}
