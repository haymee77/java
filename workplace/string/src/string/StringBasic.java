package string;

public class StringBasic {
    public static void main(String[] args) {
        String str1 = "My String";
        String str2 = "My String";
        String str3 = "Your String";
        String str4 = "Your String";
        
        if (str1 == str2) {
            System.out.println("Equal instance");
        } else {
            System.out.println("Different instance");
        }
        
        if (str2 == str3) {
            System.out.println("Equal instance");
        } else {
            System.out.println("Different instance");
        }
        
        System.out.println(str2.compareTo(str1));
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.equals(str4));
    }
}
