class IfBasic
{
	public static void main(String args[])
	{
		int num = 10;

		// num 이 0보다 크면
		if (num > 0) {

			System.out.println("num은 0보다 크다");	

		}

		// num 이 짝수이면
		if (num % 2 == 0) {

			System.out.println("num은 짝수");		

		// num 이 홀수이면
		} else {

			System.out.println("num은 홀수");

		}

		num = 120;

		// num 이 0보다 작으면
		if (num < 0) {

			System.out.println("0 미만");

		// num 이 0보다 크거나 같으면
		} else if (num < 100) {

			System.out.println("0 이상 100 미만");

		} else {

			System.out.println("100 이상");
		}
	}
}