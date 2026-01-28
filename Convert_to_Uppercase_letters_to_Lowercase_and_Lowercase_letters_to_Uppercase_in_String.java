class Convert_to_Uppercase_letters_to_Lowercase_and_Lowercase_letters_to_Uppercase_in_String 
{
	public static void main(String[] args) 
	{
		String s="spIDEr";
		System.out.println(s);
		System.out.println(solve(s));
	}
	public static String solve(String s)
	{
		char[] a=s.toCharArray();
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>='A' && a[i]<='Z')
			{
				a[i]=(char)(a[i]+32);
			}
			else if (a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		return new String(a);
	}
}
