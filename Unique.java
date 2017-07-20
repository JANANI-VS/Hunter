import java.io.*;
import java.util.*;
public class Unique {
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
	
		int[] a=new int[n];
		
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=1;
		Arrays.sort(a);
		System.out.println("The sorted array ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==i)
			{
				System.out.println("The numbe "+a[i]+" equal its index "+i);
			}
		}
		}
    }
