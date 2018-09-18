class Person {
    private int perID;
    private int milID;
    
    public Person(int pID, int mID) {
	perID = pID;
	milID = mID;
    }
    
    public Person(int pID) {
	perID = pID;
	milID = 0;
    }
    
    public void showInfo() {
	System.out.println("m no. " + perID);
	
	if (milID != 0) {
	    System.out.println("mil no. " + milID + "\n");
	} else {
	    System.out.println("No mil no.\n");
	}
    }
}

public class Overloading {
    public static void main(String[] args) {
	Person male = new Person(880502, 1234567);
	Person female = new Person(880902);
	
	male.showInfo();
	female.showInfo();
    }
}
