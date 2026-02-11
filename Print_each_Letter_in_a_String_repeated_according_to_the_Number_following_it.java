class Print_each_Letter_in_a_String_repeated_according_to_the_Number_following_it
{
	public static void main(String[] args) 
	{
		String s="a3b12c5d14";
		solve(s);
	}
	public static void solve(String s)
	{
		String num="";
		char[] a=s.toCharArray();
		
		for (int i=1;i<a.length ;i++ )
		{
			if (Character.isDigit(a[i]))
			{
				num=num+a[i];
			}
			else
				num=num+" ";
		}
		String[] num_array=num.split(" ");
		int x=0;
		
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isLetter(a[i]))
			{
				for (int j=1;j<=Integer.parseInt(num_array[x]) ;j++ )
				{
					System.out.print(a[i]+"");
				}
				System.out.println();
				x++;
			}
		}
	}
}
