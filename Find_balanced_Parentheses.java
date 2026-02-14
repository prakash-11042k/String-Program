class Find_balanced_Parentheses 
{
	public static void main(String[] args) 
	{
		String s="{}[]()"; // {[()]}
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s)
	{
		char[] a=s.toCharArray();
		String stack="";
		
		for (int i=0;i<a.length ;i++ )
		{
			// Push opening brackets
			if (a[i]=='[' || a[i]=='{'|| a[i]=='(')
			{
				stack=stack+a[i];
			}
			// If closing bracket
			else if (a[i]==']' || a[i]=='}'|| a[i]==')')
			{
				if ( stack.length()==0)
				{
					return false;
				}
				
				char top=stack.charAt(stack.length()-1);
				
				// Pop
				stack=stack.substring(0,stack.length()-1);
				
				// Check match
				if ((a[i]==']' && top!='[') ||
					(a[i]==')' && top!='(') ||
					(a[i]=='}' && top!='{'))
				{
					return false;
				}
			}
		}
		return stack.length()==0;
	}
}
