import java.util.Scanner;
public class rotateArray{
    public static void rotateArrayByOne(int arr[],int k){
        // int n=arr.length;
        // int num=arr[n-1];
        // for(int i=n-1;i>=1;i--){
        //     arr[i]=arr[i-1];
        // }
        // arr[0]=num;
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int n=arr.length;
        int array[]=new int[k];
        for(int i=n-1;i>=(n-k);i--){
            array[n-i-1]=arr[i];
        }
        for(int j=0;j<k;j++){
            for(int i=n-1;i>=k;i--){
                arr[i]=arr[i-1];
            }
        }
        for(int i=0;i<k;i++){
            arr[i]=array[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        rotateArrayByOne(arr,k);
        sc.close();
    }
}