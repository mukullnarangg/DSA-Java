import java.util.*;
public class ReverseArray{
	public static void main(String[] args) {
		int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
	}
	int temp;
	for(int i=0,j=n-1;i<=j;i++,j--){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	for(int i=0;i<n;i++){
		System.out.println(a[i]);
	}
}
}
