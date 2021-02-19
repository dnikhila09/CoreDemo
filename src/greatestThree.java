import java.util.Scanner;

public class greatestThree 
{

	public static void main(String[] args) 
	{

		
		Scanner s =new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();

			      if( num1 >= num2 && num1 >= num3)
			          System.out.println(num1+" is the largest Number");

			      else if (num2 >= num1 && num2 >= num3)
			          System.out.println(num2+" is the largest Number");

			      else
			          System.out.println(num3+" is the largest Number");
			 
	}

}
