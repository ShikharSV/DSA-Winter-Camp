import java.util.*;
public class sortArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<n-i-1;j++){
                int k=0;
                String s1=arr[i];
                String s2=arr[j];
                for(int l=0;l<s1.length();l++){
                    if(s1.charAt(k)>s2.charAt(k)){
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    k++;
                }
            }
        }
        for(String str:arr){
            System.out.print(str+" ");
        }
        sc.close();
    }
}