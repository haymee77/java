package string;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "880507-1234567";
        String str2 = "980917-2234567";
        String str3 = "080717-3234567";
        String str4 = "020917-4234567";
        
        /*
         * �ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ϰ� ������ ���ϴ� �޼ҵ带 ���� ����ÿ�.
         * ��¿�) ����, 1988�� 05�� 07�� ��
         */
        
        System.out.println(gender(str1) + ", " + birth(str1));
        System.out.println(gender(str2) + ", " + birth(str2));
        System.out.println(gender(str3) + ", " + birth(str3));
        System.out.println(gender(str4) + ", " + birth(str4));
    }
    
    public static String birth(String regiNo) {
       return regiNo.substring(0, 2) + "�� " + regiNo.substring(2, 4) + "��" + regiNo.substring(4, 6) + "�� ��";
    }
    
    public static String gender(String regiNo) {
        return (regiNo.charAt(7) == '1') ? "����" : "����";
    }
}
