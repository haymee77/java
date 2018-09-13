class  ByTimes
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 10; i++)
		{
			if (i % 2 != 0) continue;
			System.out.println(i + "´Ü");
			for (int j = 1; j < 10; j++)
			{
				System.out.println(i + " X " + j + " = " + (i * j));
				if (i == j) break;
			}
			System.out.println("");
		}
		System.out.println("Hello World!");
	}
}
