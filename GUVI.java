# Hunter
import java.io.*;
import java.util.*;
public class GUVI
{
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
	for(int i=0;i<n-1;i++)
	{
				if(a[i]==a[i+1])
		{
			count++;
		}
		else
		{
			System.out.println(a[i]+" repeated "+count+" times");
			count=1;
		}
		
		
			
	}
	for(int i=n-1;i<n;i++)
	{
		if(a[i]!=a[i-1])
		{
			System.out.println(a[i]+" repeated "+count+" times");
		}
		else
		{
			break;
		}
	}
	
	
	}
	
				
	}
