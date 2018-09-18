class Person {
    private int pID;
    private int mID;
    private int bY;
    private int bM;
    private int bD;
    
    public Person(int pID, int mID, int bY, int bM, int bD) {
        this.pID = pID;
        this.mID = mID;
        this.bY = bY;
        this.bM = bM;
        this.bD = bD;
    }
    
    public Person(int pID, int bY, int bM, int bD) {
	    this(pID, 0, bY, bM, bD);
    }
    
    public void showInfo() {
    	System.out.println("m no. " + pID);
        System.out.println("Birth: " + this.bY + "/" + this.bM + "/" + this.bD);
	
        if (mID != 0) {
            System.out.println("mil no. " + mID + "\n");
        } else {
            System.out.println("No mil no.\n");
        }
    }
}

public class Overloading2 {
    public static void main(String[] args) {
	Person male = new Person(880502, 1234567, 1988, 5, 2);
	Person female = new Person(880902, 1988, 9, 3);
	
	male.showInfo();
	female.showInfo();
    }
}
