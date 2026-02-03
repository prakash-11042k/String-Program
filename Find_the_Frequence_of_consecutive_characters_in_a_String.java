class Find_the_Frequence_of_consecutive_characters_in_a_String 
{
	public static void main(String[] args) 
	{
		String s="aaabbaa";
		solve(s);
	}
	public static void solve(String s)
	{
		char[] a=s.toCharArray();
		int count=1;
		
		for (int i=0;i<a.length-1;i++ )
		{
			if (a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.print(a[i]+""+count);
				count=1;
			}
		}
		System.out.println(a[a.length-1]+""+count);
	}
}
