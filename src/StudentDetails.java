import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3,sub4,sub5;
		float total,avg, percentage;
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter student Name");
		String Name = s.next();
		System.out.println("enter RollNo:");
		int RollNo = s.nextInt();
		System.out.println("enter branch");
		String branch =s.next();
		
		System.out.println("enter marks of 5 subjects");
		
		 sub1 = s.nextInt();
	     sub2 = s.nextInt();
	     sub3 = s.nextInt();
	     sub4 = s.nextInt();
	     sub5 = s.nextInt();
	     
	     total =  (sub1+sub2+sub3+sub4+sub5);
	     avg = total/5;
	     percentage = (total / 500) * 100 ;
	      
	     System.out.println("percentageis:"+ percentage);
	     
	     if( percentage >= 80)
	     {
	    	 System.out.println("Distinction");
	     }
	     else if( percentage >= 40 &&  percentage< 80)
	     { 
	    	 System.out.println("pass");
	     }
	     else
	    	 System.out.println("fail");
	       
	     
	    
	    

	}

}
