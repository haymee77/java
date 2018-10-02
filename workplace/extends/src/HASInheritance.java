class Gun {
    int bullet;
    
    public Gun(int bnum) {
        bullet = bnum;
    }
    
    public void shot() {
        System.out.println("BBANG!!");
        bullet--;
    }
}

class Police extends Gun {
    int handcuffs;
    
    public Police(int bnum, int bcuff) {
        // 상위클래스의 생성자 호출
        super(bnum);
        handcuffs = bcuff;
    }
    
    public void putHandCuff() {
        System.out.println("SANP!");
        handcuffs--;
    }
}

public class HASInheritance {
    public static void main(String[] args) {
        Police pman = new Police(5, 3);
        pman.shot();
        pman.putHandCuff();
    }
}
