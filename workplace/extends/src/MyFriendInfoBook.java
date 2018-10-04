import java.util.Scanner;

class Friend {
    String name;
    String phoneNum;
    String addr;
    
    public Friend(String name, String phone, String addr) {
        this.name = name;
        this.phoneNum = phone;
        this.addr = addr;
    }
    
    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNum);
        System.out.println("Address: " + addr);
    }
    
    public void showBasicInfo() {}
}

class HighFriend extends Friend {
    String work;
    
    public HighFriend(String name, String phone, String addr, String job) {
        super(name, phone, addr);
        work = job;
    }
    
    public void showData() {
        super.showData();
        System.out.println("job: " + work);
    }
    
    public void showBasicInfo() {
        System.out.println("name: " + name);    
        System.out.println("phone: " + phoneNum);
    }
}

class UnivFriend extends Friend {
    String major;
    
    public UnivFriend(String name, String phone, String addr, String job, String major) {
        super(name, phone, addr);
        this.major = major;
    }
    
    public void showData() {
        super.showData();
        System.out.println("major: " + major);
    }
    
    public void showBasicInfo() {
        System.out.println("name: " + name);    
        System.out.println("phone: " + phoneNum);
        System.out.println("major: " + major);
    }
}

class FriendInfoHandler {
    private Friend[] myFriends;
    private int numOfFriends;
    
    public FriendInfoHandler(int num) {
        myFriends = new Friend[num];
        numOfFriends = 0;
    }
    
    private void addFriendInfo(Friend fren) {
        myFriends[numOfFriends++] = fren;
    }
    
    public void addFriend(int choice) {
        String name, phoneNum, addr, job, major;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Name: ");
        name = sc.nextLine();
        
        System.out.print("Phone: ");
        phoneNum = sc.nextLine();
        
        System.out.print("Address: ");
        addr = sc.nextLine();
        
        if (choice == 1) {
            System.out.println("Job: ");
            job = sc.nextLine();
            
            addFriendInfo(new HighFriend(name, phoneNum, addr, job));
        } else {
            System.out.println("Major: ");
            major = sc.nextLine();
            
            addFriendInfo(new HighFriend(name, phoneNum, addr, major));
        }
        
        System.out.println("Finish!");
    }
    
    public void showAllData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showData();
            System.out.println("");
        }
    }
    
    public void showAllSimpleData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showBasicInfo();
            System.out.println("");
        }
    }
}

class MyFriendInfoBook {
    public static void main(String[] args) {
        FriendInfoHandler handler = new FriendInfoHandler(10);
        
        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Save High School Friend");
            System.out.println("2. Save Universe Friend");
            System.out.println("3. Show All Info");
            System.out.println("4. Show Basic Info");
            System.out.println("5. Exit");
            
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1 : case 2 : 
                handler.addFriend(choice);
                break;
            case 3 :
                handler.showAllData();
                break;
            case 4 :
                handler.showAllSimpleData();
                break;
            case 5 :
                System.out.println("Exit");
                return;
            }
        }
    }
}