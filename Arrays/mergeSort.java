import java.util.*;
public class mergeSort {
    public static void merge(int[]arr,int m, int l, int r){
        int len1=m-l+1;
        int len2=r-m;

        int[]a1=new int[len1];
        int[]a2=new int[len2];
        for(int i=0;i<len1;i++){
            a1[i]=arr[l+i];
        }
        for(int j=0;j<len2;j++){
            a2[j]=arr[m+1+j];
        }

        int i=0,j=0,k=l;
        while(i<len1 && j<len2){
            if(a1[i]<=a2[j]){
                arr[k]=a1[i];
                i++;
            }
            else if(a1[i]>a2[j]){
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<len2){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr, m, l, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
