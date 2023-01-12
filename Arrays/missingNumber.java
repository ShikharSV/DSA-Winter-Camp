import java.util.Scanner;
public class missingNumber {
    public static int findMissing(int[]arr){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            if((arr[i+1]-arr[i])!=1)
                return arr[i]+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMissing(arr));
    }
}
