import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int x;
		System.out.println("enter a number");
		x=s.nextInt();
		
		if((x >= -9 && x <= 9))
				System.out.println("single digit");
		else
		{
			System.out.println("not a single digit");
		}

	}

}
