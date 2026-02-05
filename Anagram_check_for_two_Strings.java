import java.util.Arrays;
class Anagram_check_for_two_Strings 
{
	public static void main(String[] args) 
	{
		String s1="earth",s2="heart";
		System.out.println(isAnagram(s1,s2)?"Anagram":"Not-Anagram");
	}
	public static boolean isAnagram(String s1,String s2)
	{
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a,b);
	}
	
}
