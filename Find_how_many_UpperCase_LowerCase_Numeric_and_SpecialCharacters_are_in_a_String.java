class Find_how_many_UpperCase_LowerCase_Numeric_and_SpecialCharacters_are_in_a_String
{
	public static void main(String[] args) 
	{
		String s="AbcBRd83k$#8";
		System.out.println(s);
		solve(s);
	}
	public static void solve(String s)
	{
		char[] a=s.toCharArray();
		int uc_count=0, //uc -> UpperCase
			lc_count=0, // lc -> LowerCase
			num_count=0, // num -> Numeric/Number
			sc_count=0; // sc -> SpecialCharacter
		
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isUpperCase(a[i]))
			{
				uc_count++;
			}
			else if (Character.isLowerCase(a[i]))
			{
				lc_count++;
			}
			else if (Character.isDigit(a[i]))
			{
				num_count++;
			}
			else
				sc_count++;
		}
		System.out.println("Total Upper Case:"+uc_count);
		System.out.println("Total Lower Case:"+lc_count);
		System.out.println("Total Numbers:"+num_count);
		System.out.println("Total Special Characters:"+sc_count);
	}
}
