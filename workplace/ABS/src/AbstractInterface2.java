interface PersonalNumberStorage2 {
    void addPersonalInfo(String name, String number);
    String searchName(String perNum);
}

class PersonalNumInfo2 {
    String name;
    String number;
    
    public String getName() {
        return name;
    }
    
    public String getNumber() {
        return number;
    }

    public PersonalNumInfo2(String name, String number) {
        this.name = name;
        this.number = number;
    }   
    
}

class PersonalNumberStorageImpl2 implements PersonalNumberStorage2 {
    PersonalNumInfo2[] perArr;
    int numOfPerInfo;
    
    public PersonalNumberStorageImpl2(int sz) {
        perArr = new PersonalNumInfo2[sz];
        numOfPerInfo = 0;
    }
    
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo2(name, perNum);
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

public class AbstractInterface2 {
    public static void main(String[] args) {
        PersonalNumberStorage2 storage = new PersonalNumberStorageImpl2(100);
        storage.addPersonalInfo("Branden", "958989-7887545");
        storage.addPersonalInfo("Cathy", "789865-9865328");
        
        System.out.println(storage.searchName("958989-7887545"));
        System.out.println(storage.searchName("789865-9865328"));
        
    }
}
