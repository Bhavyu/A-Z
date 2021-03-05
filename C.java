class C
{
	public static void main(String args[])
	{
		for(int i=0;i<7;i++)
		{
			for(int j =0;j<7;j++)
			{
				if(((i==6 || i==0) && j>0) || (i<6 && i>0 && j<1))
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