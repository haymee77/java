class PrePostfixOp
{
	public static void main(String[] args)
	{
		int n1 = 7;
		int n2, n3;

		n2 = ++n1;	// n1�� ���� 1 ���� �� n2�� ����
		n3 = --n1;		// n1�� ���� 1 ���� �� n3�� ����

		System.out.println(n1);	//	7
		System.out.println(n2);	// 8
		System.out.println(n3);	// 7

		n1 = 7;			
		n2 = n1++;	// n1�� ���� n2�� ���� �� 1 ����
		n3 = n1--;		// n1�� ���� n3�� ���� �� 1 ����

		System.out.println(n1);	//	7
		System.out.println(n2);	// 7
		System.out.println(n3);	// 8
	}
}