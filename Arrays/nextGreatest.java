import java.util.Scanner;
import java.util.Stack;

public class nextGreatest {
    public static void nextGreat(int[] arr,int n){
        Stack<Integer> s1=new Stack<>();
        s1.add(arr[n-1]);
        arr[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int num=arr[i];
            while(!s1.isEmpty() && arr[i]>s1.peek()){
                s1.pop();
            }
            if(s1.isEmpty())
                arr[i]=0;
            else
                arr[i]=s1.peek();
            
            s1.push(num);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={2,4,6,1,8,3,9,5};
        nextGreat(arr,arr.length);
        sc.close();
    }
}
