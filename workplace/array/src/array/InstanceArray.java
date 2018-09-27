package array;

public class InstanceArray {
    public static void main(String[] args) {
        int[] arrInt = {2, 4, 6, 8};
        
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("arrInt[" + i + "]: " + arrInt[i]);
        }
        
        String[] arrStr = new String[3];
        
        arrStr[0] = new String("Java");
        arrStr[1] = new String("JSP");
        arrStr[2] = "Servlet";
        
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]: " + arrStr[i]);
        }
    }
}
