
public class nestedLoop2 {

	public static void main(String[] args) {
		int i,j,n=5;
		 
		for(i = 1;i <= n;i++)
		{
			for(j = n;j >= i;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
