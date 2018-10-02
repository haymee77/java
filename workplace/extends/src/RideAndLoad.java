class Aa {
    public void rideMethod() { System.out.println("Aa's Method"); }
    public void loadMethod() { System.out.println("void Method"); }
}

class Bb extends Aa {
    public void rideMethod() { System.out.println("Bb's Method"); }
    public void loadMethod(int i) { System.out.println("int Method"); }
}

class Cc extends Bb {
    public void rideMethod() { System.out.println("Cc's Method"); }
    public void loadMethod(double d) { System.out.println("double Method"); }
}

public class RideAndLoad {
    public static void main(String[] args) {
        Aa ref1 = new Cc();
        Bb ref2 = new Cc();
        Cc ref3 = new Cc();
        
        ref1.rideMethod();
        ref2.rideMethod();
        ref3.rideMethod();
        
        ref1.loadMethod();
        ref2.loadMethod(10);
        ref3.loadMethod(3.4);
    }

}
