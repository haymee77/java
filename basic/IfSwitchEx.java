class IfSwitchEx
{
	public static void main(String[] args) {
		/*
		score �� ������ �̿��� ������ ���ϴ� if���� �����Ͻÿ�.
		������ 60�� �̻� 'D', 70�� �̻� 'C', 80�� �̻� 'B', 90�� �̻� 'A'
		*/

		int score = 75;

		if (score >= 60 && score < 70) {

			System.out.println('D');

		} else if (score >= 70 && score < 80) {

			System.out.println('C');

		} else if (score >= 80 && score < 90) {

			System.out.println('B');

		} else if (score >= 90) {

			System.out.println('A');

		} else {

			System.out.println('F');

		}

		score = -1;

		if (score >= 0 && score < 10) {
			System.out.println("0�̻� 10�̸��� ��");
		} else if (score >= 10 && score < 20) {
			System.out.println("10�̻� 20�̸��� ��");
		} else if (score >= 20 && score < 30) {
			System.out.println("20�̻� 30�̸��� ��");
		} else {
			System.out.println("���� Ȥ�� 30�̻��� ��");
		} 

		switch (score) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:				
				System.out.println("0�̻� 10�̸��� ��");
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:	
				System.out.println("10�̻� 20�̸��� ��");
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:	
				System.out.println("20�̻� 30�̸��� ��");
				break;
			default:
				System.out.println("���� Ȥ�� 30�̻��� ��");
		}

		switch (score/10)
		{
			case 0:
				System.out.println("0�̻� 10�̸��� ��");
				break;
			case 1:
				System.out.println("10�̻� 20�̸��� ��");
				break;
			case 2:
				System.out.println("20�̻� 30�̸��� ��");
				break;
			default:
				System.out.println("���� Ȥ�� 30�̻��� ��");		
		}

		System.out.println(-3/10);

	}
}