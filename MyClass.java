import java.util.Scanner;

class MyClass
{
	public static void main(String args[])
	{
 		System.out.println("enter your name");
		
		Scanner sc = new Scanner(System.in);
 		String str = sc.nextLine();
 		System.out.println("name is :" + str);
	}
}