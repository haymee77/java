class WhileDoBasic
{
	public static void main(String[] args) {

		int i =1;

		while (i <= 5)  {
			System.out.println("i : " + i);
			i++;
		}

		i = 1;
		do {
			System.out.println("i : " + i);
			i++;
		} while (i <= 5);

		int sum = 0;
		i = 1;
		while (i <= 100)	{
			sum += i;
			i++;
		}

		System.out.println("1부터 100까지 합(while): " + sum);

		sum = 0;
		i = 1;

		do {
			sum += i;
			i++;
		} while (i <= 100);

		System.out.println("1부터 100까지 합(do~while): " + sum);
	}
}