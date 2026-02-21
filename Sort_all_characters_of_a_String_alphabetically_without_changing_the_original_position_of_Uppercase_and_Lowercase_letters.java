import java.util.*;
class Sort_all_characters_of_a_String_alphabetically_without_changing_the_original_position_of_Uppercase_and_Lowercase_letters 
{
	public static void main(String[] args) 
	{
		String s="gCmdHZAaB";
		String res=solve(s);
		System.out.println(res);
	}
	public static String solve(String s)
	{
		// Step-1 -> Convert String to Character array and sort
		char[] a=s.toCharArray();
		Arrays.sort(a);
		
		// Step-2 -> Find first lowercase index in sorted array [ a <- ABCHadgm]
		int x=0,y=0;
		
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isLowerCase(a[i]))
			{
				y=i;
				break;
			}
		}
		
		// Step-3 -> Prepare result array
		char[] b=s.toCharArray();
		
		// Step-4 -> Replace character based on original case [ b <- aAdgBCHmz]
		for (int i=0;i<b.length ;i++ )
		{
			if (Character.isLowerCase(b[i]))
			{
				b[i]=a[y++];
			}
			else if (Character.isUpperCase(b[i]))
			{
				b[i]=a[x++];
			}
		}
		return new String(b);
	}
}
