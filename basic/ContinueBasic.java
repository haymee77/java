class ContinueBasic
{
	public static void main(String[] args) 
	{
		int num = 0;
		int count = 0;

		while (num++ < 100)
		{
			// 100보다 작은 5와 7의 공배수 출력 및 개수 출력
			if (num % 5 != 0 || num % 7 != 0)
			{
				continue;
			}

			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
