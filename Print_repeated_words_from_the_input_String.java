class Print_repeated_words_from_the_input_String
{
	public static void main(String[] args) 
	{
		String s="This is This java python from java";
		solve(s);
	}
	public static void solve(String s)
	{
		String[] a=s.split(" ");
		
		for (int i=0;i<a.length ;i++ )
		{
			int count=1;
			
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i].equals(a[j]))
				{
					count++;
				}
			}
			if (count>1)
		    {
			    System.out.print(a[i]+" ");
		    }
		}
	}
}
