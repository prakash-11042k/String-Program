class Remove_the_Duplicate_elements_in_a_String 
{
	public static void main(String[] args) 
	{
		String s="Hello World Helicopter";
		
		String ans="";
		
		for (int i=0;i<s.length() ;i++ )
		{
			char a=s.charAt(i);
			if (a==' ')
			{
				ans=ans+" ";
			}
			else if (ans.indexOf(a)==-1)
			{
				ans=ans+s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
