class FirstJava
{
	public static void main(String[] args) 
	{
		System.out.println("2 + 5 = " + 2 + 5);	// 2 + 5 = 25
		System.out.println("2 + 5 = " + ( 2 + 5 ));	// 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5");	// 7 = 2 + 5

		int n = 5;

		for (int i = 0; i < n; i++)
		{
			for (int j = n - i; j > 0; j--)
			{
				System.out.print(' ');
			}
			for (int j = 0; j < (2 * i + 1); j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
