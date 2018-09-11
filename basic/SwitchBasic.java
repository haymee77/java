class SwitchBasic {
	public static void main(String[] args) {
		int num = 2;

		switch (num) {
			case 1:
				System.out.println("1st");
				break;

			case 2:
				System.out.println("2nd");
				break;

			case 3:
				System.out.println("3rd");
				break;

			case 4:
				System.out.println("4th");
				break;

			default:
				System.out.println("default");		
		}

        // JDK 1.7 이상에서는 문자열도 switch 문에서 사용 가능
        String str = "abc";

        switch (str) {
            case "aaa":
                System.out.println("case aaa");
                break;
            case "bbb":
                System.out.println("case bbb");
                break;
            case "abc":
                System.out.println("case abc");
                break;
            default:
                System.out.println("case default");
                break;
        }
    }
}