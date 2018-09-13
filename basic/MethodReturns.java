class MethodReturns 
{
	public static void main(String[] args) 
	{
		int result = adder(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("14 + 25 = " + adder(14, 25));

		double rs2 = square(3.5);
		System.out.println("3.5^2: " + rs2);
	}

	public static int adder(int a, int b)
	{
		int addResult = a + b;
		return addResult;
	}

	public static double square(double n)
	{
		return n * n;
	}
}
