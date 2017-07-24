import java.io.*;
import java.util.*;
public class Vowels 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the character");
		CharSequence a=(CharSequence) br.readLine();
		String s="aeiou";
		if(s.contains(a))
		{
			System.out.println("The character "+a+" is vowel");
		}
		else
		{
			System.out.println("The character "+a+" is consonant");
		}
		
	}

}
