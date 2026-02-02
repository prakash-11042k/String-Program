import java.util.*;
class Find_the_Longest_Common_Prefix_among_a_given_set_of_Strings 
{
	public static String solve(String s[]) 
	{
		String ans="";
		Arrays.sort(s);
		
		String s1=s[0];
		String s2=s[s.length-1];
		
		for (int i=0;i<s1.length() && i<s2.length() ;i++ )
		{
			char a=s1.charAt(i);
			char b=s2.charAt(i);
			
			if (a!=b)
			{
				return ans;
			}
			else
				ans=ans+a;
		}
		return ans;
	}
	public static void main(String[]args)
	{
		String s[]={"Flower","Flow","Flight"};
		System.out.println(solve(s));
	}
}
