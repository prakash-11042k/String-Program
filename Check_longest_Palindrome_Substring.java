class Check_longest_Palindrome_Substring 
{
	public static void main(String[] args) 
	{
		String s="babad";
		System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s)
	{
		char[] a=s.toCharArray();
		int minLength=1;
		String temp=s.substring(0,1);
		
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+minLength;j<=a.length ;j++ )
			{
				if (j-i>minLength && isPalindrome(s.substring(i,j)))
				{
					minLength=j-i;
					temp=s.substring(i,j);
				}
			}
		}
		return temp;
	}
	public static boolean isPalindrome(String s)
	{
		int l=0,r=s.length()-1;
		
		while (l<r)
		{
			if (s.charAt(l)!=s.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
