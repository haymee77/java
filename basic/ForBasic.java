class ForBasic
{
	public static void main(String[] args) {
		// int�� ���� i�� 1�� �ְ� i�� 5���� �۰ų� ������ ���๮�� �����ϰ�,
		// i�� 1������Ŵ(�������� �� �ʱ�ȭ -> ���� -> ���� -> ������ -> ���� -> ���� -> ������ -> ...
		// for������ ������ ������ for���� ����Ǹ� �Ҹ��
		for (int i = 1; i <= 5; i++) {

			System.out.println("i : " + i);
		}	

		// 1���� 100������ ��
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 + 2 + ... + 99 + 100 = " + sum);
	}
}