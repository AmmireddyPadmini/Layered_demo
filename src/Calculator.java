import java.util.*;
 class Calculator {
	public static int Add(int a,int b)
	{
		return a+b;
	}
	public static int Sub(int a,int b)
	{
		return a-b;
	}
	public static float Div(int a,int b)
	{
		return a/b;
	}
	public static  int Mul(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("....Claculator Demo....");
		while(true)
		{
		System.out.println("Enter two values for calculations");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("1.Addition \t 2.Subtraction \t 3.Division \t 4.Multiplication\n");
		System.out.println("Enter your choice:");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Sum of "+ x +" and  "+y +" is :"+Add(x,y));
			break;
		case 2:
			System.out.println("DIfference of"+x+" and"+y+" is :"+Div(x,y));
			break;
		case 3:
			System.out.println("Multiplication of"+x+" and "+y+" is :"+Mul(x,y));
			break;
		case 4:
			System.out.println("Dision of "+x+" and"+y+" is :"+Div(x,y));
	    default:
				System.out.println("Invalid choice");
	    flag=true;
				
		return ;	
			
			
		}
	}
	}
	

}
