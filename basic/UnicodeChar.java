class UnicodeChar 
{
	public static void main(String[] args) 
	{
		char ch1 = 'A', ch2 = 'Z', ch3 = 'a', ch4 = 'z', ch5 = '��', ch6 = '�R';
		// ������ �ڷ����� ��� �� �ٿ� ���� ���� ������ ������ �� ����

		int i1 = ch1, i2 = ch2, i3 = ch3, i4 = ch4, i5 = ch5, i6 = ch6;
		// int�� �������� char�� ���� �� �� �ִ�.

		char ch7 = 44123;

		System.out.println(ch1 + " : " + i1);		// A : 65
		System.out.println(ch2 + " : " + i2);		// Z : 90
		System.out.println(ch3 + " : " + i3);		// a : 97
		System.out.println(ch4 + " : " + i4);		// z : 122
		System.out.println(ch5 + " : " + i5);		// �� : 44032
		System.out.println(ch6 + " : " + i6);		// �R : 55203
		System.out.println(ch7);

	}
}