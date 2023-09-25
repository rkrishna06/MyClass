class Variables
{
	static int a=10;  //static variable
	int c=30;   //instace variable
	public static void main(String args[])
	{
		int b=20;   //local variable
		Variables v = new Variables();
		System.out.println("local variable :" + b);       //local variable
		System.out.println("instace variable : " + v.c);  //instace variable
		System.out.println("static variable:" + a);   //static variable
	}
}
