class DataTypeConversion
{
	public static void main(String[] args)
	{
		double d1 = 120;
		// 정수가 실수로 변환되는 것은 자동 - 자동 형변환

		int n1 = (int) 20.83;
		// 실수를 정수로 받으려면 강제 형변환이 필요.. 소수점 이하 버림!!

		System.out.println(d1);
		System.out.println(n1);
	}
}