class BreakBasic 
{
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;

		// 5�� 7�� �ּ� �����
		while (num < 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				search = true;
				break;
			}
			num++;
		}

		if (search) {
			System.out.println("ã�� ����: " + num);
		} else {
			System.out.println("ã�� ���߽��ϴ�.");
		}

		outerLoop :
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 10; j++)
			{
				System.out.println("i: " + i + ", j: " + j);
				if (i % 2 == 0 && j % 2 == 0)
				{
					break outerLoop;
				}
			}
		}

	}
}
