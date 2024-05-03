import java.util.Scanner;
public class SecondLargest
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){a[i]=sc.nextInt();}
	int fm=0;
	int sm=0;
		for(int i=0;i<n;i++){
		    if(a[i]>fm){
		         sm=fm;
		        fm=a[i];
		       
		    }
		   System.out.println(sm);
		}
	
	}
}