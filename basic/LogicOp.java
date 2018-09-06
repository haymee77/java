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

		rs = (n1 += 10) < 10 && (n2 += 10) > 0;
		System.out.println("rs: " + rs);							// false
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 10 | n2: 0

		rs = (n1 += 10) > 0 || (n2 += 10) > 0;
		System.out.println("rs: " + rs);							// true
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 20 | n2 : 0
	}
}