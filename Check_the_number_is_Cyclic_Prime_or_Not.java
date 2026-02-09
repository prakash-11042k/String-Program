class Check_the_number_is_Cyclic_Prime_or_Not
{
	public static void main(String[] args) 
	{
		String s="1193";
		System.out.println(isCyclicPrime(s));
	}
	public static boolean isPrime(int number)
	{
		if (number==0 && number==1)
		{
			return false;
		}
		for (int i=2;i<number ;i++ )
		{
			if (number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isCyclicPrime(String s)
	{
		for (int i=0;i<s.length() ;i++ )
		{
			if (!isPrime(Integer.parseInt(s)))
			{
				return false;
			}
			//Rotate the number
			s=s.substring(1)+s.charAt(0);
		}
		return true;
	}
}
