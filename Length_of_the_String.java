class Length_of_the_String 
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2=new String("Oracle SQL");
		StringBuffer s3=new StringBuffer("Web Tech");
		StringBuilder s4=new StringBuilder("Manual Testing");
		
		System.out.println(s1+":"+s1.length());//4
		System.out.println(s2+":"+s2.length());//10
		System.out.println(s3+":"+s3.length());//8
		System.out.println(s4+":"+s4.length());//14
	}
}
