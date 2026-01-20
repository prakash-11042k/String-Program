import java.util.Scanner;
class Compare_the_String_and_Check_both_Strings_are_Same_or_Not 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t Enter Food 1:");
		String Food1=sc.nextLine();
		
		System.out.print("\t\t\t Enter Food 2:");
		String Food2=sc.nextLine();
		
		System.out.println(Food1==Food2); // Compare the address
		System.out.println(Food1.equals(Food2)); // Compare the content
		System.out.println(Food1.equalsIgnoreCase(Food2)); //Compare the content by ignoring the case
	}
}
