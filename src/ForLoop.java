import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		
	     int i,sum=0,n;
	     Scanner s = new Scanner(System.in);
	     System.out.println("enter the number");
	       n = s.nextInt();
	     
		      for(i=1; i <= n; i++)
		        {
		    	  
		         sum = sum + i;
		      		        }
		      
		      System.out.println(" the sum of series :" +sum);
		      
	}

}
