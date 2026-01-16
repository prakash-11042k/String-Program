class Traverse_the_String 
{
	public static void main(String[] args) 
	{
		String s="Spider Man";
		for (int i=0;i<s.length() ;i++ )
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n***************");
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			System.out.print(s.charAt(i));
		}
	}
}
