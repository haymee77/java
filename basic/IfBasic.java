class IfBasic
{
	public static void main(String args[])
	{
		int num = 10;

		// num �� 0���� ũ��
		if (num > 0) {

			System.out.println("num�� 0���� ũ��");	

		}

		// num �� ¦���̸�
		if (num % 2 == 0) {

			System.out.println("num�� ¦��");		

		// num �� Ȧ���̸�
		} else {

			System.out.println("num�� Ȧ��");

		}

		num = 120;

		// num �� 0���� ������
		if (num < 0) {

			System.out.println("0 �̸�");

		// num �� 0���� ũ�ų� ������
		} else if (num < 100) {

			System.out.println("0 �̻� 100 �̸�");

		} else {

			System.out.println("100 �̻�");
		}
	}
}