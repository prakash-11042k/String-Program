class Check_whether_One_String_is_a_Rotation_of_another_String 
{
	public static void main(String[] args) 
	{
		String s="abcde",r="cdeab";
		System.out.println(isRotated(s,r));
	}
	public static boolean isRotated(String s,String r)
	{
		s=s+s;
		return s.contains(r);
	}
}
