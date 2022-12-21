import java.util.*;
public class ques1 {
    public static void unionArray(int[]arr1,int[]arr2){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        } 
    }
    public static void intersectionArray(int[]arr1,int[]arr2){
       int i=0,j=0;
       Set<Integer> set=new HashSet<>();
       while(i<arr1.length && j<arr2.length){
        if(arr1[i]==arr2[j]){
            set.add(arr1[i]);
            i++;
            j++;
        }
        else if(arr1[i]>arr2[j]){
            j++;
        }
        else if(arr1[i]<arr2[j]){
            i++;
        }
       } 
       Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.println("Enter "+n+" value in array 1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter "+m+" value in array 2");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        unionArray(arr1, arr2);
        System.out.println();
        intersectionArray(arr1, arr2); 
        sc.close();
    }
}
