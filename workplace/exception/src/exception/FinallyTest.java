package exception;

public class FinallyTest {

    public static void main(String[] args) {
        boolean divOK = divider(4, 2);
        
        if (divOK) {
            System.out.println("Divide Success");
        } else {
            System.out.println("Divide Failed");
        }
        
        divOK = divider(4, 0);
        
        if (divOK) {
            System.out.println("Divide Success");
        } else {
            System.out.println("Divide Failed");
        }
    }
    
    public static boolean divider(int n1, int n2) {
        try {
            int result = n1 / n2;
            System.out.println("Result divided: " + result);
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Finally..");
        }
    }
}
