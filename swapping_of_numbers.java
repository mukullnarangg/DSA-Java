import java.util.*;
public class swapping{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
int temp = a[0];
a[0]=a[n-1];
a[n-1]=temp;
for(int i =0;i<n;i++){
	System.out.println(a[i]);
}
}
}
