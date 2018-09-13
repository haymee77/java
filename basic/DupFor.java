class DupFor 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.println("var i: " + i);
			for (int j = 0; j < 3; j++)
			{
				System.out.println("** var j: " + j);
			}
		}

		for (int i = 2; i < 5; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}
}
