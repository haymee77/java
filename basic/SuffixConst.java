class SuffixConst
{
	public static void main(String[] args)
	{
		double e1 = 7.125;
		float e2 = 7.125F;
		// �Ǽ��� �⺻���� double�� ���� 4byte�� float�� ������ ������ �߻��ϹǷ� float���� ����ȯ

		long n1 = 10000000000L;
		// ������ �⺻���� int�� ǥ���� �� ���� ���� ǥ���ϸ� ������ �߻��ϹǷ� long���� ����ȯ

		long n2 = 150;
		// int���� �����͸� long�� �����Ϳ� �ִ� ���� ��������
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(n1);
		System.out.println(n2);
	}
}