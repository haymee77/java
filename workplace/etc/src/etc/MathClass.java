package etc;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("������: " + Math.PI);
        System.out.println("2�� ������: " + Math.sqrt(2));
        
        double radian45 = Math.toRadians(45);
        System.out.println("sin 45: " + Math.sin(radian45));
        System.out.println("cos 45: " + Math.cos(radian45));
        System.out.println("tan 45: " + Math.tan(radian45));
        
        System.out.println("log 45: " + Math.log(25));
        System.out.println("2�� 4��: " + Math.pow(2, 4));
    }
}
