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
		// && �������� ��� �տ��� false�� ������ ���� ���� ������� ����

		System.out.println("rs: " + rs);							// false
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 10 | n2: 0
	
		n2 += 10;
		n1 += 10;

		rs = n1 < 0 || n2 > 0;
		// || �������� ��� �տ��� true�� ������ ���� ���� ������� ����

		System.out.println("rs: " + rs);							// true
		System.out.println("n1: " + n1 + " | n2: " + n2);	// n1: 20 | n2 : 0
	}
}