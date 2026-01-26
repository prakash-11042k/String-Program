class Add_only_Integers_in_String 
{
	public static void main(String[] args) 
	{
		String s="ab12abc34c";
		int res=solve(s);
		System.out.println(res);
	}
	public static int solve(String s)
	{
		char[] a=s.toCharArray();
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isDigit(a[i])) //or if(a[i]>='0' && a[i]<='9')
			{
				sum=sum+a[i]-48;
			}
		}
		return sum;
	}
}
