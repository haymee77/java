class ArithOp
{
	public static void main(String[] args)
	{
		int n1 = 7;
		int n2 = 3;

		int result = n1 + n2;
		System.out.println("���� ��� : " + result);

		result = n1 - n2;
		System.out.println("���� ��� : " + result);
		System.out.println("���� ��� : " + n1 * n2);
		System.out.println("������ ��� : " + n1 / n2);
		System.out.println("������ ��� : " + n1 % n2);

		n1 += 5;	// n1 = n1 + 5;
		n2 *= 10;	// n2 = n2 * 10;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
	}
}