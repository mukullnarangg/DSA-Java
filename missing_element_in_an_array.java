import java.util.*;
public class Missing{
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
}
for(int j=0;j<n-1;j++){
	for(int i=0;i<n-1;i++){
	if(a[i]>a[i+1]){
	int temp = a[0];
	a[0]=a[n-1];
	a[n-1]=a[0];
		}
	}
}
for(int i = 0;i<n; i++){
	if(a[i]!=i+1){
		System.out.println(i+1);
		break;
	}
}
}
}
