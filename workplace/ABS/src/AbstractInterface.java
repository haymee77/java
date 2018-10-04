abstract class PersonalNumberStorage {
    public abstract void addPersonalInfo(String name, String number);
    public abstract String searchName(String perNum);
}

class PersonalNumInfo {
    String name;
    String number;
    
    public String getName() {
        return name;
    }
    
    public String getNumber() {
        return number;
    }

    public PersonalNumInfo(String name, String number) {
        this.name = name;
        this.number = number;
    }   
    
}

class PersonalNumberStorageImpl extends PersonalNumberStorage {
    PersonalNumInfo[] perArr;
    int numOfPerInfo;
    
    public PersonalNumberStorageImpl(int sz) {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo = 0;
    }
    
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
        numOfPerInfo++;
    }
    
    public String searchName(String perNum) {
        for (int i = 0; i < numOfPerInfo; i++) {
            if (perNum.compareTo(perArr[i].getNumber()) == 0) {
                return perArr[i].getName();
            }
        }
        
        return null;
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
        storage.addPersonalInfo("Branden", "958989-7887545");
        storage.addPersonalInfo("Cathy", "789865-9865328");
        
        System.out.println(storage.searchName("958989-7887545"));
        System.out.println(storage.searchName("789865-9865328"));
        
    }
}
