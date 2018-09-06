class PrePostfixOp
{
	public static void main(String[] args)
	{
		int n1 = 7;
		int n2, n3;

		n2 = ++n1;	// n1의 값을 1 증가 후 n2에 대입
		n3 = --n1;		// n1의 값을 1 감소 후 n3에 대입

		System.out.println(n1);	//	7
		System.out.println(n2);	// 8
		System.out.println(n3);	// 7

		n1 = 7;			
		n2 = n1++;	// n1의 값을 n2에 대입 후 1 증가
		n3 = n1--;		// n1의 값을 n3에 대입 후 1 감소

		System.out.println(n1);	//	7
		System.out.println(n2);	// 7
		System.out.println(n3);	// 8
	}
}