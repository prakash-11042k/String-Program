class Reverse_only_Letters_in_a_String_Keeping_SpecialCharacters_in_the_same_position 
{
	public static void main(String[] args) 
	{
		String s="Hi @ how # you";
		String res=solve(s);
		System.out.println(s);
		System.out.println(res);
	}
	public static String solve(String s)
	{
		char[] a=s.toCharArray();
		int l=0,r=a.length-1;
		while (l<r)
		{
			if (Character.isLetter(a[l]) && Character.isLetter(a[r]))
			{
				char temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			if (!Character.isLetter(a[l]) && !Character.isDigit(a[l]))
			{
				l++;
			}
			if (!Character.isLetter(a[r]) && !Character.isDigit(a[r]))
			{
				r--;
			}
		}
		return new String(a);
	}
}
