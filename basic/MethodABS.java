// �� ���� ������ �Ű������� �޾� �� ���� ������ ���̿� ���� ���밪�� �����ϴ� �޼ҵ� ����

class MethodABS 
{
	public static void main(String[] args) 
	{
		int abs1 = returnAbs(10, 5);
		int abs2 = returnAbs(7, 15);

		System.out.println("difference between 10, 5: " + abs1);
		System.out.println("difference between 7, 15: " + abs2);
		System.out.println("Hello World!");
	}

	public static int returnAbs(int n1, int n2)
	{
		return (n1 - n2 > 0) ? (n1 - n2) : -(n1 - n2); 
	}
}
