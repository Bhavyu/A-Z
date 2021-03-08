class E
{
	public static void main(String args[])
	{
		for(int i=0;i<7;i++)
		{
			for(int j =0;j<7;j++)
			{
				if(i%3 ==0 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}