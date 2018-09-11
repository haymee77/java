class ForBasic
{
	public static void main(String[] args) {
		// int형 변수 i에 1을 넣고 i가 5보다 작거나 같으면 실행문을 실행하고,
		// i를 1증가시킴(변수선언 및 초기화 -> 조건 -> 실행 -> 증감식 -> 조건 -> 실행 -> 증감식 -> ...
		// for문에서 선언한 변수는 for문이 종료되면 소멸됨
		for (int i = 1; i <= 5; i++) {

			System.out.println("i : " + i);
		}	

		// 1부터 100까지의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 + 2 + ... + 99 + 100 = " + sum);
	}
}