package string;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "test@test.com";
        String str2 = "testtest.com";
        String str3 = "test@testcom";
        String str4 = "test.test@com";
        
        /* 문제
         * 4개의 문자열에 들어있는 이메일 주소를 검사하여 이메일 주소 규칙에 맞는 문자열 출력
         * 
         * 규칙 1. '@'가 있어야 한다.
         * 규칙 2. '@' 뒤에 '.'이 있어야 함
         * 규칙 3. '.'은 가장 뒤에 있으면 안됨
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
