import java.util.Scanner;
class Read_the_sentence_in_String 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t Enter the Sentence:");
		String sentence=sc.nextLine();
		System.out.println("Entered sentence is:"+sentence);
	}
}
