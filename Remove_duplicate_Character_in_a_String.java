class Remove_duplicate_Character_in_a_String 
{
	public static void main(String[] args) 
	{
		String s="developer";
		String res=solve(s);
		System.out.println(res);
	}
	public static String solve(String s)
	{
		char[] a=s.toCharArray();
		String ans="";
		
		for (int i=0;i<a.length ;i++ )
		{
			if (ans.indexOf(a[i])==-1)
			{
				ans=ans+a[i];
			}
		}
		return ans;
	}
}
