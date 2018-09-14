class Num {
    int num;
    
    public Num() {
	num = 10;
	System.out.println("Call constroctor");
    }
    
    public int getNumber() {
	return num;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
	Num num1 = new Num();
	System.out.println(num1.getNumber());
	
	Num num2 = new Num();
	System.out.println(num2.getNumber());
    }
}
