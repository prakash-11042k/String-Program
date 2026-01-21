import java.util.Scanner;
class Check_the_String_is_Palindrome_or_Not 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t Enter the String:");
		String s=sc.nextLine();
		
		if (isPalindrome(s))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not-Palindrome");
	}
	public static boolean isPalindrome(String s)
	{
		String rev="";
		
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			rev=rev+s.charAt(i);
		}
		return rev.equalsIgnoreCase(s);
	}
}
