import java.util.*;
public class rabinKarp {
    public static int count(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                c++;
            }
        }
        return c+1;
    }
    public static boolean rabinAlgo(String str,String subStr, int hashCode){
        int cou=count(str);
        String []arr=new String[cou];
        arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String S=arr[i];
            int hc=0,k=0;
            for(int j=S.length()-1;j>=0;j--){
                hc+=j*Math.pow(10, k);
                k++;
            }
            if(hc==hashCode)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String subStr=sc.next();
        int hashCode=0;
        int k=0;
        for(int i=subStr.length()-1;i>=0;i--){
            hashCode+=i*Math.pow(10, k);
            k++;
        }
        System.out.println(rabinAlgo(str,subStr,hashCode));
        sc.close();
    }
}
