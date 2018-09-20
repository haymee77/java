package string;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "880507-1234567";
        String str2 = "980917-2234567";
        String str3 = "080717-3234567";
        String str4 = "020917-4234567";
        
        /*
         * 주민등록번호를 이용하여 생년월일과 성별을 구하는 메소드를 각각 만드시오.
         * 출력예) 남자, 1988년 05월 07일 생
         */
        
        System.out.println(gender(str1) + ", " + birth(str1));
        System.out.println(gender(str2) + ", " + birth(str2));
        System.out.println(gender(str3) + ", " + birth(str3));
        System.out.println(gender(str4) + ", " + birth(str4));
    }
    
    public static String birth(String regiNo) {
       return regiNo.substring(0, 2) + "년 " + regiNo.substring(2, 4) + "월" + regiNo.substring(4, 6) + "일 생";
    }
    
    public static String gender(String regiNo) {
        return (regiNo.charAt(7) == '1') ? "남자" : "여자";
    }
}
