package etc;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        Integer iValue = 10;
        Double dValue = 3.14;
        
        System.out.println(iValue);
        System.out.println(dValue);
        
        int n1 = iValue;
        double n2 = dValue;
        
        System.out.println(iValue);
        System.out.println(dValue);
    }
}
