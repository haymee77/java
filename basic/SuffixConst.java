class SuffixConst
{
	public static void main(String[] args)
	{
		double e1 = 7.125;
		float e2 = 7.125F;
		// 실수의 기본형인 double의 값을 4byte인 float에 넣으면 오류가 발생하므로 float으로 형변환

		long n1 = 10000000000L;
		// 정수의 기본형인 int로 표현할 수 없는 값을 표현하명 오류가 발생하므로 long으로 형변환

		long n2 = 150;
		// int형의 데이터를 long형 데이터에 넣는 것은 문제없음
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(n1);
		System.out.println(n2);
	}
}