class MethodDefAdd 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		double tall = 175.9;
		hiEveryone(12, tall);
		hiEveryone(33, 184.4);
		byeEveryone();
		
		System.out.println("Program Exit");
	}

	public static void hiEveryone(int age, double height)
	{
		// �Ű����� age�� hiEveryone() �� ����� �� �Ҹ��
		System.out.println("Still too hot.");
		System.out.println("I'm " + age + " years old.");
		System.out.println("I'm " + height + "cm.");
	}

	public static void byeEveryone()
	{
		System.out.println("See ya.");
	}
}
