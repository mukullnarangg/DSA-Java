import java.util.*;
public class binary{
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
int low=0,high=n-1,mid=(high+low)/2;
int check=0;
while(low<=high){
   if(a[mid]<key){
       low=mid+1;
       mid=(high+low)/2;
   }
   else if(a[mid]>key){
       high=mid-1;
       mid=(high+low)/2;
   }
   else if(a[mid]==key){
       System.out.println(mid+1);
       System.out.println("Found");
       check=1;
       
       break;
   }
}
if(check==0){
System.out.print("not found");
}
}
}
