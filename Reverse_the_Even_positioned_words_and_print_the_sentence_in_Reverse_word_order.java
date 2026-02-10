class Reverse_the_Even_positioned_words_and_print_the_sentence_in_Reverse_word_order
{
	public static void main(String[] args) 
	{
		String s="Hi how are you?";
		String ans="";
		String[] a=s.split(" ");
		
		for (int i=a.length-1;i>=0 ;i-- )
		{
			if (i%2==0)
			{
				ans=ans+solve(a[i])+" ";
			}
			else
				ans=ans+a[i]+" ";
		}
		System.out.println(ans);
	}
	public static String solve(String s)
	{
		String rev="";
		
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
