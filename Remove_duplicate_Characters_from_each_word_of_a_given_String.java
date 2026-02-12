class Remove_duplicate_Characters_from_each_word_of_a_given_String 
{
	public static void main(String[] args) 
	{
		String s="This is java hello you can learn this skill";
		String[] a=s.split(" ");
		String ans="";
		
		for (int i=0;i<a.length ;i++ )
		{
			ans=ans+removeDuplicate(a[i]+" ");
		}
		System.out.println(s);
		System.out.println(ans);
	}
	public static String removeDuplicate(String word)
	{
		String ans="";
		char[] a=word.toCharArray();
		
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
