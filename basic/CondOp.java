class CondOp
{
	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big, diff;

		// num1 이 num2 보다 크면 num1을, 작으면 num2를 big 변수에 넣어라.
		big = (num1 > num2) ? num1 : num2;
		System.out.println("더 큰 놈: " + big);

		// num1 이 num2 보다 크면 num1 에서 num2 를 뺀 값을, 
		// 작으면 num2 에서 num1 을 뺀 값을 big 변수에 넣어라.
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("차: " + diff);

	}
}