class Find_the_Frequency_of_each_Character_in_a_String 
{
	public static void main(String[] args) 
	{
		String s="hello";
		System.out.println(solve(s));
	}
	public static String solve(String s)
	{
		int[] a=new int[26];
		boolean[] b=new boolean[26];
		char[] c=s.toCharArray();
		
		for (int i=0;i<c.length ;i++ )
		{
			a[c[i]-'a']++;
			b[c[i]-'a']=true;
		}
		
		String ans="";
		
		for (int i=0;i<c.length ;i++ )
		{
			if (b[c[i]-'a'])
			{
				ans=ans+c[i]+":"+a[c[i]-'a']+"\n";
				b[c[i]-'a']=false;
			}
		}
		return ans;
	}
}
