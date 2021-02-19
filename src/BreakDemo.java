
public class BreakDemo {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			if(i==8) { break;}
			System.out.println(i);
		}
	}

}
