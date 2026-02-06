class Check_the_String_is_Pangram_or_Not 
{
	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		
		if (isPangram(s))
		{
			System.out.println("Pangram");
		}
		else
			System.out.println("Not a Pangram");
	}
	public static boolean isPangram(String s)
	{
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		boolean[] b=new boolean[26];
		
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]!=' ')
			{
				b[a[i]-'a']=true;
			}
		}
		
		for (int i=0;i<b.length ;i++ )
		{
			if (!b[i])
			{
				return false;
			}
		}
		return true;
	}
}
