import java.util.*;
public class Diff{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
int max = a[0],min = a[0];
for(int i =0;i<n;i++){
	if(a[i]>max){
		max=a[i];
	}
	if(a[i]<min){
		min=a[i];
	}
}
System.out.println("diff is "+ (max-min));
}
}
