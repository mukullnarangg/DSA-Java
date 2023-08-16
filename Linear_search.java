import java.util.*;
public class LinearSearch{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
int key;
key=sc.nextInt();
for(int i=0;i<n;i++){
   if(key==a[i])
   {
       System.out.println("found");
       break;
   }
   else if(i==n-1){
       System.out.println("not found");
    }
}
}
}
