class LogicOp
{
	public static void main(String[] args)
	{
		int n1 = 10, n2 = 20;
		
		boolean rs1 = (n1 == 10 && n2 == 20);
		boolean rs2 = (n1 <= 12 || n2 >= 30);

		System.out.println("n1 == 10 && n2 == 20 : " + rs1);
		System.out.println("n1 <= 12 || n2 >= 30 : " + rs1);

		n1 = 0;
		n2 = 0;
		boolean rs;

		n2 += 10;
		n1 += 10;

		rs = n2 > 0 && n1 < 10;
		// && 연산자의 경우 앞에서 false가 나오면 뒤의 식은 실행되지 않음

		System.out.println("rs: " + rs);							// false
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 10 | n2: 0
	
		n2 += 10;
		n1 += 10;

		rs = n1 < 0 || n2 > 0;
		// || 연산자의 경우 앞에서 true가 나오면 뒤의 식은 실행되지 않음

		System.out.println("rs: " + rs);							// true
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 20 | n2 : 0
	}
}