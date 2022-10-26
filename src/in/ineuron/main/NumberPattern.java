package in.ineuron.main;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i,j;
		
		for(i=1;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(i!=0)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
