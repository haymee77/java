class IfSwitchEx
{
	public static void main(String[] args) {
		/*
		score 의 점수를 이용해 학점을 구하는 if문을 구현하시오.
		학점은 60점 이상 'D', 70점 이상 'C', 80점 이상 'B', 90점 이상 'A'
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
			System.out.println("0이상 10미만의 수");
		} else if (score >= 10 && score < 20) {
			System.out.println("10이상 20미만의 수");
		} else if (score >= 20 && score < 30) {
			System.out.println("20이상 30미만의 수");
		} else {
			System.out.println("음수 혹은 30이상의 수");
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
				System.out.println("0이상 10미만의 수");
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
				System.out.println("10이상 20미만의 수");
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
				System.out.println("20이상 30미만의 수");
				break;
			default:
				System.out.println("음수 혹은 30이상의 수");
		}

		switch (score/10)
		{
			case 0:
				System.out.println("0이상 10미만의 수");
				break;
			case 1:
				System.out.println("10이상 20미만의 수");
				break;
			case 2:
				System.out.println("20이상 30미만의 수");
				break;
			default:
				System.out.println("음수 혹은 30이상의 수");		
		}

		System.out.println(-3/10);

	}
}