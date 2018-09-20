package string;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "test@test.com";
        String str2 = "testtest.com";
        String str3 = "test@testcom";
        String str4 = "test.test@com";
        
        /* ����
         * 4���� ���ڿ��� ����ִ� �̸��� �ּҸ� �˻��Ͽ� �̸��� �ּ� ��Ģ�� �´� ���ڿ� ���
         * 
         * ��Ģ 1. '@'�� �־�� �Ѵ�.
         * ��Ģ 2. '@' �ڿ� '.'�� �־�� ��
         * ��Ģ 3. '.'�� ���� �ڿ� ������ �ȵ�
         */
        
        checkEmail(str1);
        checkEmail(str2);
        checkEmail(str3);
        checkEmail(str4);
    }
    
    public static void checkEmail(String email) {
        int posAt = email.indexOf('@');
        int posLastDot = email.lastIndexOf('.');
        
        if (posAt > 0 && posLastDot > 0
                && posAt < posLastDot
                && posLastDot < email.length() - 1) {
            System.out.println(email + " - success");
        } else {
            System.out.println(email + " - failed");
        }
    }
}
