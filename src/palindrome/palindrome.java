package palindrome;

import java.util.Scanner;

public class palindrome {
	static Scanner console = new Scanner(System.in);
	public static void check(String str){
		if(str==null||str.length()==1)
		{
			System.out.println("The string is not a palindrome");
			return;
		}
			for(int i=0,j=str.length()-1;i<=j;i++,j--)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					System.out.println("The string is not a palindrome");
					return;
				}
			}
			System.out.println("The string is a palindrome");
	}

	public static void main(String[] args){
		System.out.println("Enter a String to check for palindrome");
		String str=console.nextLine();
		System.out.println("The string is "+str);
		check(str);
	}
