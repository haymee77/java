class ExitReturn 
{
	public static void main(String[] args) 
	{
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
		System.out.println("Hello World!");
	}

	public static void divide(int n1, int n2)
	{
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println("Divice result: " + (n1 / n2));
		}
	}
}
