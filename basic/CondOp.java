class CondOp
{
	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big, diff;

		// num1 �� num2 ���� ũ�� num1��, ������ num2�� big ������ �־��.
		big = (num1 > num2) ? num1 : num2;
		System.out.println("�� ū ��: " + big);

		// num1 �� num2 ���� ũ�� num1 ���� num2 �� �� ����, 
		// ������ num2 ���� num1 �� �� ���� big ������ �־��.
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("��: " + diff);

	}
}